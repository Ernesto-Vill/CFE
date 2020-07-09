package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialDesmanteladoEntity;

public interface MaterialDesmanteladoDao extends CrudRepository<MaterialDesmanteladoEntity,String> {

}
