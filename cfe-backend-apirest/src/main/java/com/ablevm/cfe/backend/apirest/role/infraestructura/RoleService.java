package com.ablevm.cfe.backend.apirest.role.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.role.dominio.RoleEntity;

public interface RoleService {
 
	public List<RoleEntity>findAll();

}
