package br.com.forum.DTO

import br.com.forum.model.Curso
import br.com.forum.model.Resposta
import br.com.forum.model.Status
import br.com.forum.model.Usuario
import com.sun.istack.NotNull
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotEmpty

data class TopicoPost(
    @NotEmpty
    val titulo: String,
    @NotEmpty
    val mensagem: String,
    @NotNull
    val curso: Curso,
    @NotNull
    val aluno: Usuario,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val status: Status = Status.NAO_SOLUCIONADO,
    val respostas: List<Resposta> = ArrayList()
)