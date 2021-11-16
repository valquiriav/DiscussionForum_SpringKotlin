package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm (

    @field:NotEmpty(message = "Campo não pode ser vazio.")
    @Size(min = 5, max = 100, message = "Tamanho deve ser entre 5 e 100 caracteres.")
    val titulo: String,

    @field:NotEmpty(message = "Campo não pode ser vazio.")
    val mensagem: String,

    @field:NotNull(message = "Campo não pode ser vazio.")
    val idCurso: Long,

    @field:NotNull(message = "Campo não pode ser vazio.")
    val idAutor: Long

)