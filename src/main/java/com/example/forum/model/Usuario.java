package com.example.forum.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Long id;
	private String nome;
	private String email;
	private String senha;


	// construtor default exigido pela JPA
	protected Usuario() {
	}


	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
