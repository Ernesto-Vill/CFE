package com.ablevm.cfe.backend.apirest.ubicacion.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.ubicacion.dominio.Ubicacion;

public interface UbicacionService {
 
	public List<Ubicacion>findAll();
}
