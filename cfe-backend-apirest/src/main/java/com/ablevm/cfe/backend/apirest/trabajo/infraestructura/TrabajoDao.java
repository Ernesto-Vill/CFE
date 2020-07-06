package com.ablevm.cfe.backend.apirest.trabajo.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.trabajo.dominio.TrabajoEntity;

public interface TrabajoDao extends CrudRepository<TrabajoEntity,Long> {

}
