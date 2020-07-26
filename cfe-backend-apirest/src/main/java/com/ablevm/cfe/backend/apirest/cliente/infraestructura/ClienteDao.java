package com.ablevm.cfe.backend.apirest.cliente.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.cliente.dominio.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,String> {

}
