package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialOcupadoEntity;

public interface MaterialOcupadoService {
 
	public List<MaterialOcupadoEntity>findAll();
}
