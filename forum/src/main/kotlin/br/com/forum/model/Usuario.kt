package br.com.forum.model

import javax.persistence.Entity

@Entity
data class Usuario(
    val id: Long? = null,
    val nome: String,
    val email: String
)
