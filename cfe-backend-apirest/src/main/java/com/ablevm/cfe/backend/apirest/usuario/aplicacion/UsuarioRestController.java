package com.ablevm.cfe.backend.apirest.usuario.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.usuario.dominio.UsuarioEntity;
import com.ablevm.cfe.backend.apirest.usuario.infraestructura.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuario")
	public List<UsuarioEntity>index(){
		return usuarioService.findAll();
	}
}
