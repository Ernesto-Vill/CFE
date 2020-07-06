package com.ablevm.cfe.backend.apirest.trabajo.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.trabajo.dominio.TrabajoEntity;

public interface TrabajoService {
 
	public List<TrabajoEntity>findAll();
}
