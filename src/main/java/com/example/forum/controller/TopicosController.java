package com.example.forum.controller;

import com.example.forum.controller.dto.TopicoDTO;
import com.example.forum.model.Curso;
import com.example.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class TopicosController {

    @RequestMapping("/topicos")
public List<TopicoDTO> lista(){
        Topico topico = new Topico("Dúvida", "Duvida Spring", new Curso("Java Spring" , "Programação"));
        return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
    }
}