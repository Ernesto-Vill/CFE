package com.ablevm.cfe.backend.apirest.material.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;

public interface MaterialDao extends CrudRepository<MaterialEntity,Long> {

}
