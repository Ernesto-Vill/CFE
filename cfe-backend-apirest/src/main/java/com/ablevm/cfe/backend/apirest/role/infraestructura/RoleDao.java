package com.ablevm.cfe.backend.apirest.role.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.role.dominio.Role;

public interface RoleDao extends CrudRepository<Role,Long> {
}

