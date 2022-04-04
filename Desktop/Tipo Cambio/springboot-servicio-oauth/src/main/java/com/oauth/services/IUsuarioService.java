package com.oauth.services;

import com.oauth.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
