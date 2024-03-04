package usecases

import dtos.CreateTransferRequestDTO
import dtos.CreateTransferResponseDTO

interface ICreateTransferUseCase {
    fun handle(input: CreateTransferRequestDTO) : CreateTransferResponseDTO
}