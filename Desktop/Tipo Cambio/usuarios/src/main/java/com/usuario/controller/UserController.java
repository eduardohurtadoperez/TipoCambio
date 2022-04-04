package com.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.models.entity.Usuario;
import com.usuario.services.IUserService;



@RestController
@RequestMapping("/usuario")
public class UserController {

	@Autowired
	public IUserService iUserService;;


	@GetMapping("/obtener")
	public Usuario convertir(@RequestParam String username) {
		return iUserService.findByUsername(username);
	}


}
