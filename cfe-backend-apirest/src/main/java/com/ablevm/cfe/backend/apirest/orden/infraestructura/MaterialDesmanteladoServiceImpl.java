package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.orden.dominio.MaterialDesmanteladoEntity;

@Service
public class MaterialDesmanteladoServiceImpl implements MaterialDesmanteladoService{

	@Autowired
	private MaterialDesmanteladoDao materialDesmanteladoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MaterialDesmanteladoEntity> findAll() {
		
		return (List<MaterialDesmanteladoEntity>) materialDesmanteladoDao.findAll();
	}

	
}
