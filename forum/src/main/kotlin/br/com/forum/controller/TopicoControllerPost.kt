package br.com.forum.controller

import br.com.forum.DTO.TopicoPost
import br.com.forum.DTO.TopicoResponse
import br.com.forum.model.Topico
import br.com.forum.service.TopicoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoControllerPost(private val service: TopicoService) {
    @PostMapping
    @Transactional
    fun salvar(@RequestBody @Valid topico: TopicoPost,
               uriBuilder: UriComponentsBuilder): ResponseEntity<TopicoResponse>{
        //Caso fosse um projeto real utilizaria um DTO para retorno
        val topico: TopicoResponse = service.salvar(topico)

        val uri = uriBuilder.path("/topicos/${topico.id}").build().toUri()
        return ResponseEntity.created(uri).body(topico)
    }
}