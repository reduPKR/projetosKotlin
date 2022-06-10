package br.com.forum.DTO

import br.com.forum.model.Curso
import br.com.forum.model.Resposta
import br.com.forum.model.Status
import br.com.forum.model.Usuario
import java.time.LocalDateTime

class TopicoResponse (
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val curso: Curso,
    val aluno: Usuario,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val status: Status = Status.NAO_SOLUCIONADO,
    val respostas: List<Resposta> = ArrayList()
)
