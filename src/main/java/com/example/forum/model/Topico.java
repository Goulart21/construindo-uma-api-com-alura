package com.example.forum.model;

public class Topico {

	private String titulo;
	private String mensagem;
	private Curso curso;

	public Topico(String titulo, String mensagem, Curso curso) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.curso = curso;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Curso getCurso() {
		return curso;
	}
}