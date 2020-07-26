package com.ablevm.cfe.backend.apirest.material.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.material.dominio.Material;
import com.ablevm.cfe.backend.apirest.material.infraestructura.MaterialService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MaterialRestController {
	
	@Autowired
	private MaterialService materialService;
	
	@GetMapping("/material")
	public List<Material>index(){
		return materialService.findAll();
	}
	
	@GetMapping("/material/{id}")
	public Material show(@PathVariable Integer id) {
		return this.materialService.findById(id);
	}

	@PostMapping("/material")
	@ResponseStatus(HttpStatus.CREATED)
	public Material create(@RequestBody Material material) {
		this.materialService.save(material);
		return material;
	}

	@PutMapping("/material/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Material update(@RequestBody Material material, @PathVariable Integer id) {
		Material currentMaterial = this.materialService.findById(id);
		currentMaterial.setNomMat(material.getNomMat());
		currentMaterial.setDescMat(material.getDescMat());
		currentMaterial.setUniMat(material.getUniMat());
		this.materialService.save(currentMaterial);
		return currentMaterial;
	}
	
	@DeleteMapping("/material/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		Material currentMaterial = this.materialService.findById(id);
		this.materialService.delete(currentMaterial);
	}

}
