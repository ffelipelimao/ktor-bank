package routing

import controllers.createTransferController
import io.ktor.server.application.*
import io.ktor.server.routing.*
import usecases.CreateTransferUseCase

fun Application.configureRouting() {
    routing {
        createTransferController()
    }
}
