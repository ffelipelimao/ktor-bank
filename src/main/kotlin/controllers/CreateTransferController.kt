package controllers

import dtos.CreateTransferRequestDTO
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.http.*
import errors.InvalidUserIdException
import repository.queries.TransferRepository
import usecases.CreateTransferUseCase

fun Route.createTransferController(transferRepository: TransferRepository) {
    val createTransferUseCase = CreateTransferUseCase(transferRepository)

    route("clientes/{id}/transacoes") {
        post {
            val input = call.receive<CreateTransferRequestDTO>()
            val userId = call.parameters["id"]

            try {
                val output = createTransferUseCase.handle(input, userId)
                call.respond(HttpStatusCode.OK, output)
            }catch (e: InvalidUserIdException){
                call.respond(HttpStatusCode.BadRequest, e)
            }catch (e: Exception){
                call.respond(HttpStatusCode.InternalServerError, e)
            }
        }
    }
}