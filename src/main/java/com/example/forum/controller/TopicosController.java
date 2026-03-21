package com.example.forum.controller;

import com.example.forum.controller.dto.TopicoDTO;
import com.example.forum.model.Curso;
import com.example.forum.model.Topico;
import com.example.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//contrller é o pacote que "conversa com o usuario, respondendo as requicoções"
// já o DTO serve para mostrar dados necessarios, evitando assim a exposição de dados sensiveis


@RestController
public class TopicosController {
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
public List<TopicoDTO> lista(){

        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDTO.converter(topicos);

    }
}