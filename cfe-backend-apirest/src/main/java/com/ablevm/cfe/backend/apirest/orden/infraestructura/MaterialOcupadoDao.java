package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialOcupadoEntity;

public interface MaterialOcupadoDao extends CrudRepository<MaterialOcupadoEntity,String> {

}
