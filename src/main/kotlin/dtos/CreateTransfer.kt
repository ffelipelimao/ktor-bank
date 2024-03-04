package dtos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateTransferRequestDTO(
    @SerialName("valor") val value: Int,
    @SerialName("tipo") val type: String,
    @SerialName("descricao") val description: String,
)

@Serializable
data class CreateTransferResponseDTO(
    @SerialName("limite") val limit: Int,
    @SerialName("valor") val value: Int,
)