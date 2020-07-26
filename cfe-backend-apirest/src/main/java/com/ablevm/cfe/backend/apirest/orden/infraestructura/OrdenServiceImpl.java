package com.ablevm.cfe.backend.apirest.orden.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.orden.dominio.Orden;

@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	private OrdenDao ordenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Orden> findAll() {
		
		return (List<Orden>) ordenDao.findAll();
	}

	
}
