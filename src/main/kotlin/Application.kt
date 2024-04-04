import config.db.DatabaseFactory
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import routing.configureRouting
import serialization.contentNegotiation

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module).start(wait = true)
}

@Suppress("unused")
fun Application.module() {
    contentNegotiation()
    DatabaseFactory.init()
    configureRouting()
}
