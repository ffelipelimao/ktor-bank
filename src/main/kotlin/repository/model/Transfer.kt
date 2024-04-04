package repository.model

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime

object TransferModel : Table(){
    val value = integer("value")
    val userId = integer("user_id")
    val type = varchar("type", 1)
    val description = varchar("description", 1)
    val createdAt = datetime("created_at")
}