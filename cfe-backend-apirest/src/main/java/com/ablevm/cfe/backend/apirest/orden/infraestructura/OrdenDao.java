package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.orden.dominio.Orden;

public interface OrdenDao extends CrudRepository<Orden,String> {

}
