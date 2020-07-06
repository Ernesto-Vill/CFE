package com.ablevm.cfe.backend.apirest.agencia.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.agencia.dominio.AgenciaEntity;

public interface AgenciaService {
 
	public List<AgenciaEntity>findAll();
}
