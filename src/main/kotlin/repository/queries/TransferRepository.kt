package repository.queries

import entities.Transfer
import org.jetbrains.exposed.sql.insert
import repository.model.TransferModel

class TransferRepository {
    fun save(transfer: Transfer): Transfer{
        TransferModel.insert {
            it[value] = transfer.value
            it[type] = transfer.type
            it[description] = transfer.description
            it[userId] = transfer.userId
            it[createdAt] = transfer.createdAt
        }
        return transfer
    }
}