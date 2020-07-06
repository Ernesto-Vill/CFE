package com.ablevm.cfe.backend.apirest.ubicacion.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.ubicacion.dominio.UbicacionEntity;

@Service
public class UbicacionServiceImpl implements UbicacionService{

	@Autowired
	private UbicacionDao ubicacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<UbicacionEntity> findAll() {
		
		return (List<UbicacionEntity>) ubicacionDao.findAll();
	}

	
}
