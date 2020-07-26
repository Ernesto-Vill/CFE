package com.ablevm.cfe.backend.apirest.zona.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.zona.dominio.Zona;

public interface ZonaDao extends CrudRepository<Zona,String> {

}
