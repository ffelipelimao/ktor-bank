package serialization

import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*

fun Application.contentNegotiation() {
    install(ContentNegotiation) {
        json()
    }
}