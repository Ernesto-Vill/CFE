package com.ablevm.cfe.backend.apirest.zona.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.zona.dominio.Zona;
import com.ablevm.cfe.backend.apirest.zona.infraestructura.ZonaService;

@RestController
@RequestMapping("/api")
public class ZonaRestController {
	
	@Autowired
	private ZonaService zonaService;
	
	@GetMapping("/zona")
	public List<Zona>index(){
		return zonaService.findAll();
	}
}
