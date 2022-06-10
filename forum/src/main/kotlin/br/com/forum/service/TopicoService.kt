package br.com.forum.service

import br.com.forum.DTO.TopicoPost
import br.com.forum.DTO.TopicoPut
import br.com.forum.DTO.TopicoResponse
import br.com.forum.mapper.TopicoMapper
import br.com.forum.repository.TopicoRepository
import org.springframework.stereotype.Service

@Service
class TopicoService(private val repository: TopicoRepository,
private val topicoMapper: TopicoMapper) {
    fun listar(): List<TopicoResponse> {
        val response = repository.findAll();
        return topicoMapper.listTopicoToResponse(response)
    }

    fun buscar(id: Long): TopicoResponse {
        val response = repository.findById(id)
        if(response.isPresent)
            return topicoMapper.topicoToResponse(response.get())
        throw Exception("Usuario nao encontrado")
    }

    fun salvar(topicoPost: TopicoPost): TopicoResponse {
        val topico = topicoMapper.topicoPostToTopico(topicoPost)
        val response = repository.save(topico)
        return topicoMapper.topicoToResponse(response)
    }

    fun atualizar(topicoPut: TopicoPut): TopicoResponse {
        val topico = topicoMapper.topicoPutToTopico(topicoPut)
        val response = repository.save(topico)
        return topicoMapper.topicoToResponse(response)
    }

    fun remover(id: Long) {
        repository.deleteById(id)
    }
}
