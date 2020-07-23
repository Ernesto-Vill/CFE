package com.ablevm.cfe.backend.apirest.material.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;

public interface MaterialService {
 
	public List<MaterialEntity>findAll();
	public void save(MaterialEntity materialEntity);
	public MaterialEntity findById(Long id);
	public void delete(MaterialEntity materialEntity);
}
