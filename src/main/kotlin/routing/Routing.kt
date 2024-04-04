package routing

import controllers.createTransferController
import io.ktor.server.application.*
import io.ktor.server.routing.*
import repository.queries.TransferRepository
import usecases.CreateTransferUseCase


val transferRepository = TransferRepository()

fun Application.configureRouting() {
    routing {
        createTransferController(transferRepository)
    }
}
