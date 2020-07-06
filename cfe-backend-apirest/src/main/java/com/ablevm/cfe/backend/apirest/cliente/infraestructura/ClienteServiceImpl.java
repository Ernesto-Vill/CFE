package com.ablevm.cfe.backend.apirest.cliente.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.cliente.dominio.ClienteEntity;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ClienteEntity>findAll() {
		
		return (List<ClienteEntity>) clienteDao.findAll();
	}
}
