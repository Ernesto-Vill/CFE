package com.ablevm.cfe.backend.apirest.usuario.aplicacion;



import java.util.List;



import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.usuario.dominio.Usuario;

import com.ablevm.cfe.backend.apirest.usuario.infraestructura.UsuarioService;



@CrossOrigin(origins= {"http://localhost:4200"})

@RestController

@RequestMapping("/api")

public class UsuarioRestController {

	

	@Autowired

	private UsuarioService usuarioService;

	

	@GetMapping("/usuario")

	public List<Usuario>index(){

		return usuarioService.findAll();

	}

	

	@GetMapping("/usuario/{id}")

	public Usuario show(@PathVariable String id) {

		return this.usuarioService.findById(id);

	}



	@PostMapping("/usuario")

	@ResponseStatus(HttpStatus.CREATED)

	public Usuario create(@RequestBody Usuario usuarioEntity) {

		usuarioEntity.setPassUsu("passwordautoico");

		this.usuarioService.save(usuarioEntity);

		

		return usuarioEntity;

	}



	@PutMapping("/usuario/{id}")

	@ResponseStatus(HttpStatus.CREATED)

	public Usuario update(@RequestBody Usuario usuarioEntity, @PathVariable String id) {

		Usuario currentUsuarioEntity = this.usuarioService.findById(id);

		currentUsuarioEntity.setNomUsu(usuarioEntity.getNomUsu());

		currentUsuarioEntity.setApPaUsu(usuarioEntity.getApPaUsu());

		currentUsuarioEntity.setApMaUsu(usuarioEntity.getApMaUsu());

		currentUsuarioEntity.setUserNameUsu(usuarioEntity.getUserNameUsu());

		currentUsuarioEntity.setRoles(usuarioEntity.getRoles());

		this.usuarioService.save(currentUsuarioEntity);

		return currentUsuarioEntity;

	}



	@DeleteMapping("/usuario/{id}")

	@ResponseStatus(HttpStatus.NO_CONTENT)

	public void delete(@PathVariable String id) {

		Usuario currentUsuario = this.usuarioService.findById(id);

		this.usuarioService.delete(currentUsuario);

	}

	

}