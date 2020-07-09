package com.ablevm.cfe.backend.apirest.orden.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialOcupadoEntity;
import com.ablevm.cfe.backend.apirest.orden.infraestructura.MaterialOcupadoService;

@RestController
@RequestMapping("/api")
public class MaterialOcupadoRestController {
	
	@Autowired
	private MaterialOcupadoService materialOcupadoService;
	
	@GetMapping("/materialOcupado")
	public List<MaterialOcupadoEntity>index(){
		return materialOcupadoService.findAll();
	}

}
