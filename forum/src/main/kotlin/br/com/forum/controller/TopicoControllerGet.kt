package br.com.forum.controller

import br.com.forum.model.Topico
import br.com.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoControllerGet(private val service: TopicoService) {
    @GetMapping
    fun listar(): List<Topico>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscar(@PathVariable id: Long): Topico{
        return service.buscar(id)
    }
}