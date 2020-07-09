package com.ablevm.cfe.backend.apirest.material.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;

@Service
public class MaterialServiceImpl implements MaterialService{

	@Autowired
	private MaterialDao materialDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MaterialEntity> findAll() {
		
		return (List<MaterialEntity>) materialDao.findAll();
	}

	
}
