package usecases

import dtos.CreateTransferRequestDTO
import dtos.CreateTransferResponseDTO
import entities.Transfer
import errors.InvalidUserIdException
import repository.queries.TransferRepository
import java.time.LocalDateTime

class CreateTransferUseCase(private val transferRepository: TransferRepository) : ICreateTransferUseCase {

    override fun handle(input: CreateTransferRequestDTO, userId: String?): CreateTransferResponseDTO {
        if(userId == null){
            throw InvalidUserIdException("empty user id")
        }

        val transfer = Transfer(
            type = input.type,
            createdAt = LocalDateTime.now(),
            value = input.value,
            description = input.description,
            userId = userId.toInt()
        )

        val transferSaved = transferRepository.save(transfer)

        //TODO
        return CreateTransferResponseDTO(0,transferSaved.value)
    }
}