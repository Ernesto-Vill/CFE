package com.ablevm.cfe.backend.apirest.orden.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialDesmanteladoEntity;
import com.ablevm.cfe.backend.apirest.orden.infraestructura.MaterialDesmanteladoService;

@RestController
@RequestMapping("/api")
public class MaterialDesmanteladoRestController {
	
	@Autowired
	private MaterialDesmanteladoService materialDesmanteladoService;
	
	@GetMapping("/materialDesmantelado")
	public List<MaterialDesmanteladoEntity>index(){
		return materialDesmanteladoService.findAll();
	}

}
