package com.ablevm.cfe.backend.apirest.trabajo.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.trabajo.dominio.Trabajo;

@Service
public class TrabajoServiceImpl implements TrabajoService{

	@Autowired
	private TrabajoDao trabajoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Trabajo> findAll() {
		
		return (List<Trabajo>) trabajoDao.findAll();
	}

	
}
