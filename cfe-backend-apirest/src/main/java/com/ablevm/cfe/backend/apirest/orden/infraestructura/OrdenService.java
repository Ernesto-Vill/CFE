package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.orden.dominio.OrdenEntity;

public interface OrdenService {
 
	public List<OrdenEntity>findAll();
}