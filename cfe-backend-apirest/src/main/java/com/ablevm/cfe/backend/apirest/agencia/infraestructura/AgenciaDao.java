package com.ablevm.cfe.backend.apirest.agencia.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.agencia.dominio.Agencia;

public interface AgenciaDao extends CrudRepository<Agencia,Long> {

}
