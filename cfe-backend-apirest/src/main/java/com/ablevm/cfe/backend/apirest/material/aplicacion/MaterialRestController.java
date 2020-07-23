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

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;
import com.ablevm.cfe.backend.apirest.material.infraestructura.MaterialService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MaterialRestController {
	
	@Autowired
	private MaterialService materialService;
	
	@GetMapping("/material")
	public List<MaterialEntity>index(){
		return materialService.findAll();
	}
	
	@GetMapping("/material/{id}")
	public MaterialEntity show(@PathVariable Long id) {
		return this.materialService.findById(id);
	}

	@PostMapping("/material")
	@ResponseStatus(HttpStatus.CREATED)
	public MaterialEntity create(@RequestBody MaterialEntity materialEntity) {
		this.materialService.save(materialEntity);
		return materialEntity;
	}

	@PutMapping("/material/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public MaterialEntity update(@RequestBody MaterialEntity materialEntity, @PathVariable Long id) {
		MaterialEntity currentMaterialEntity = this.materialService.findById(id);
		currentMaterialEntity.setNomMat(materialEntity.getNomMat());
		currentMaterialEntity.setDescMat(materialEntity.getDescMat());
		currentMaterialEntity.setUniMat(materialEntity.getUniMat());
		this.materialService.save(currentMaterialEntity);
		return currentMaterialEntity;
	}
	
	@DeleteMapping("/material/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		MaterialEntity currentMaterialEntity = this.materialService.findById(id);
		this.materialService.delete(currentMaterialEntity);
	}

}
