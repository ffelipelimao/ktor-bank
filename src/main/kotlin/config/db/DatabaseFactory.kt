package config.db

import org.jetbrains.exposed.sql.Database


object DatabaseFactory{
    fun init() {
        Database.connect(
            url = "jdbc:postgresql://localhost:5432/ktor-bank",
            driver = "org.postgresql.Driver",
            user = "user",
            password = "pass"
        )
    }
}
