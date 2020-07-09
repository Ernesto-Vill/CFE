package com.ablevm.cfe.backend.apirest.role.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.role.dominio.RoleEntity;

public interface RoleDao extends CrudRepository<RoleEntity,Long> {
}

