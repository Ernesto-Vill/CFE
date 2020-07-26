package com.ablevm.cfe.backend.apirest.agencia.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.agencia.dominio.Agencia;

@Service
public class AgenciaServiceImpl implements AgenciaService{

	@Autowired
	private AgenciaDao agenciaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Agencia> findAll() {
		
		return (List<Agencia>) agenciaDao.findAll();
	}

	
}
