package com.usuario.services;

import java.util.List;

import com.usuario.models.entity.Usuario;


public interface IUserService {
	public List<Usuario> findAll();
	public Usuario findByUsername(String username);	
	 
}
