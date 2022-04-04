package com.usuario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.dao.UsuarioDao;
import com.usuario.models.entity.Usuario;



@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	public UsuarioDao userDAO;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByUsername(String username) {
		return userDAO.findByUsername(username);
	}




}