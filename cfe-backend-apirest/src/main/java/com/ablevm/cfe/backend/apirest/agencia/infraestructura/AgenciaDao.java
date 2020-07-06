package com.ablevm.cfe.backend.apirest.agencia.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.agencia.dominio.AgenciaEntity;

public interface AgenciaDao extends CrudRepository<AgenciaEntity,Long> {

}
