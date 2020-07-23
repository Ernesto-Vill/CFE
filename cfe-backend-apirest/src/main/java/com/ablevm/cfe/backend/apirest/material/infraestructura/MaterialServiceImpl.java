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
	@Override
	@Transactional
	public void save(MaterialEntity materialEntity) {
		materialDao.save(materialEntity);
	}

	@Override
	@Transactional(readOnly = true)
	public MaterialEntity findById(Long id) {
		return materialDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(MaterialEntity materialEntity) {
		materialDao.delete(materialEntity);
		
	}
}
