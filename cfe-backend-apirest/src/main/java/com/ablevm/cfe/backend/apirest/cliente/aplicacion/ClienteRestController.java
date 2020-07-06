package com.ablevm.cfe.backend.apirest.cliente.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.cliente.dominio.ClienteEntity;
import com.ablevm.cfe.backend.apirest.cliente.infraestructura.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/cliente")
	public List<ClienteEntity>index(){
		return clienteService.findAll();
	}
}
