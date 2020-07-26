package com.ablevm.cfe.backend.apirest.material.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.material.dominio.Material;

public interface MaterialDao extends CrudRepository<Material,Integer> {

}
