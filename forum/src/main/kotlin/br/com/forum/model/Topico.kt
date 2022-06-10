package br.com.forum.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Topico(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    @ManyToOne
    val curso: Curso,
    @ManyToOne
    val aluno: Usuario,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @Enumerated(value = EnumType.STRING)
    val status: Status = Status.NAO_SOLUCIONADO,
    @OneToMany(mappedBy = "topico")
    val respostas: List<Resposta> = ArrayList()
)