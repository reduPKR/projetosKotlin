package br.com.forum.controller

import br.com.forum.DTO.TopicoPut
import br.com.forum.service.TopicoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoControllerPut(private val service: TopicoService) {

    @PutMapping
    @Transactional
    fun atualizar(@RequestBody @Valid topico: TopicoPut,
                  uriBuilder: UriComponentsBuilder): ResponseEntity<TopicoPut>{
        service.atualizar(topico)

        val uri = uriBuilder.path("/topicos/${topico.id}").build().toUri()
        return ResponseEntity.created(uri).body(topico)
    }
}