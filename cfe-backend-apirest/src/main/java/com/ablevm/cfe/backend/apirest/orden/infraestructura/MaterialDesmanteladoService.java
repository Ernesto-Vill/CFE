package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialDesmanteladoEntity;

public interface MaterialDesmanteladoService {
 
	public List<MaterialDesmanteladoEntity>findAll();
}
