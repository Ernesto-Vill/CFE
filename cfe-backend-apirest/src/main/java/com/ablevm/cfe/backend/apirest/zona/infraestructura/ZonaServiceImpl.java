package com.ablevm.cfe.backend.apirest.zona.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.zona.dominio.Zona;

@Service
public class ZonaServiceImpl implements ZonaService{

	@Autowired
	private ZonaDao zonaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Zona> findAll() {
		
		return (List<Zona>) zonaDao.findAll();
	}

	
}
