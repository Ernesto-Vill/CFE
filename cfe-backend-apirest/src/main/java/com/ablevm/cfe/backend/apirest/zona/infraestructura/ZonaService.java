package com.ablevm.cfe.backend.apirest.zona.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.zona.dominio.ZonaEntity;

public interface ZonaService {
 
	public List<ZonaEntity>findAll();
}
