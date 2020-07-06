package com.ablevm.cfe.backend.apirest.agencia.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.agencia.dominio.AgenciaEntity;
import com.ablevm.cfe.backend.apirest.agencia.infraestructura.AgenciaService;

@RestController
@RequestMapping("/api")
public class AgenciaRestController {
	
	@Autowired
	private AgenciaService agenciaService;
	
	@GetMapping("/agencia")
	public List<AgenciaEntity>index(){
		return agenciaService.findAll();
	}

}
