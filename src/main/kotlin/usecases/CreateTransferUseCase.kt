package usecases

import dtos.CreateTransferRequestDTO
import dtos.CreateTransferResponseDTO

class CreateTransferUseCase : ICreateTransferUseCase {
    override fun handle(input: CreateTransferRequestDTO): CreateTransferResponseDTO {
        return CreateTransferResponseDTO(0,0)
    }
}