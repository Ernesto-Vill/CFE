package com.ablevm.cfe.backend.apirest.material.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;
import com.ablevm.cfe.backend.apirest.material.infraestructura.MaterialService;

@RestController
@RequestMapping("/api")
public class MaterialRestController {
	
	@Autowired
	private MaterialService materialService;
	
	@GetMapping("/material")
	public List<MaterialEntity>index(){
		return materialService.findAll();
	}

}
