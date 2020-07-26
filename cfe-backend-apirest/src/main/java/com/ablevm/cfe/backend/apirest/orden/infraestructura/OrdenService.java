package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.orden.dominio.Orden;

public interface OrdenService {
 
	public List<Orden>findAll();
}