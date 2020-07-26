package com.ablevm.cfe.backend.apirest.material.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.material.dominio.Material;

public interface MaterialService {
 
	public List<Material>findAll();
	public void save(Material material);
	public Material findById(int id);
	public void delete(Material material);
}
