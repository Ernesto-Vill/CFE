package com.ablevm.cfe.backend.apirest.ubicacion.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.ubicacion.dominio.Ubicacion;
import com.ablevm.cfe.backend.apirest.ubicacion.infraestructura.UbicacionService;

@RestController
@RequestMapping("/api")
public class UbicacionRestController {
	
	@Autowired
	private UbicacionService ubicacionService;
	
	@GetMapping("/ubicacion")
	public List<Ubicacion>index(){
		return ubicacionService.findAll();
	}
}
