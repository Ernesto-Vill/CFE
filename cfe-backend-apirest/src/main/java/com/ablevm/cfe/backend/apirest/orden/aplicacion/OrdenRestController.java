package com.ablevm.cfe.backend.apirest.orden.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.orden.dominio.OrdenEntity;
import com.ablevm.cfe.backend.apirest.orden.infraestructura.OrdenService;

@RestController
@RequestMapping("/api")
public class OrdenRestController {
	
	@Autowired
	private OrdenService ordenService;
	
	@GetMapping("/orden")
	public List<OrdenEntity>index(){
		return ordenService.findAll();
	}

}
