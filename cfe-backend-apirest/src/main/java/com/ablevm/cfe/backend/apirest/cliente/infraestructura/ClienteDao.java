package com.ablevm.cfe.backend.apirest.cliente.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.cliente.dominio.ClienteEntity;

public interface ClienteDao extends CrudRepository<ClienteEntity,String> {

}
