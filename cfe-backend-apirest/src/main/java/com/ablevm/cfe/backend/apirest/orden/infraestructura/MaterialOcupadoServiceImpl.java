package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialOcupadoEntity;

@Service
public class MaterialOcupadoServiceImpl implements MaterialOcupadoService{

	@Autowired
	private MaterialOcupadoDao materialOcupadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MaterialOcupadoEntity> findAll() {
		
		return (List<MaterialOcupadoEntity>) materialOcupadoDao.findAll();
	}

	
}
