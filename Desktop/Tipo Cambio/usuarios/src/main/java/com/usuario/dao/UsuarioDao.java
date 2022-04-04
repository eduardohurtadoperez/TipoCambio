package com.usuario.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.usuario.models.entity.Usuario;


public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
