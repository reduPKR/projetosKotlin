package br.com.forum.mapper

import br.com.forum.DTO.TopicoPost
import br.com.forum.DTO.TopicoPut
import br.com.forum.DTO.TopicoResponse
import br.com.forum.model.Topico
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class TopicoMapper {
    fun topicoToResponse(topico: Topico): TopicoResponse {
        return TopicoResponse(
            topico.id,
            topico.titulo,
            topico.mensagem,
            topico.curso,
            topico.aluno,
            topico.dataCriacao,
            topico.status,
            topico.respostas
        )
    }

    fun listTopicoToResponse(response: List<Topico>): List<TopicoResponse> {
        return  response.stream().map { t -> TopicoResponse(
            t.id,
            t.titulo,
            t.mensagem,
            t.curso,
            t.aluno,
            t.dataCriacao,
            t.status,
            t.respostas
        )}.collect(Collectors.toList())
    }

    fun topicoPostToTopico(topico: TopicoPost): Topico {
        return Topico(
            null,
            topico.titulo,
            topico.mensagem,
            topico.curso,
            topico.aluno,
            topico.dataCriacao,
            topico.status,
            topico.respostas
        )
    }

    fun topicoPutToTopico(topico: TopicoPut): Topico {
        return Topico(
            topico.id,
            topico.titulo,
            topico.mensagem,
            topico.curso,
            topico.aluno,
            topico.dataCriacao,
            topico.status,
            topico.respostas
        )
    }

}
