package com.example.forum.repository;


import com.example.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

//o pacote repository é utilizado para conversar com o banco de dados (salva, busca e deleta dados) *CRUD
//primeiro parametro eu passo a entidade que eu quero manipular, e o segundo qual o tipo do atributo da chave primeira
public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
