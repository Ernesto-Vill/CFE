package com.ablevm.cfe.backend.apirest.ubicacion.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.ubicacion.dominio.UbicacionEntity;

public interface UbicacionDao extends CrudRepository<UbicacionEntity,Long> {

}
