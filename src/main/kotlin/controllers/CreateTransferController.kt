package controllers

import dtos.CreateTransferRequestDTO
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.http.*
import usecases.CreateTransferUseCase

val createTransferUseCase = CreateTransferUseCase()

fun Route.createTransferController() {
    route("clientes/{id}/transacoes") {
        post {
            val input = call.receive<CreateTransferRequestDTO>()
            val output = createTransferUseCase.handle(input)
            call.respond(HttpStatusCode.OK, output)
        }
    }
}