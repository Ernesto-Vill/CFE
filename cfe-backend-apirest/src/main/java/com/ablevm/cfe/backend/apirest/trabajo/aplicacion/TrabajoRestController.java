package com.ablevm.cfe.backend.apirest.trabajo.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.trabajo.dominio.Trabajo;
import com.ablevm.cfe.backend.apirest.trabajo.infraestructura.TrabajoService;

@RestController
@RequestMapping("/api")
public class TrabajoRestController {
	
	@Autowired
	private TrabajoService trabajoService;
	
	@GetMapping("/trabajo")
	public List<Trabajo>index(){
		return trabajoService.findAll();
	}
}
