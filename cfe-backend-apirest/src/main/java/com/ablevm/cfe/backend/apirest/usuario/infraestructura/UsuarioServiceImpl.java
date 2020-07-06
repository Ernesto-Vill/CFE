package com.ablevm.cfe.backend.apirest.usuario.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.usuario.dominio.UsuarioEntity;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<UsuarioEntity> findAll() {
		
		return (List<UsuarioEntity>) usuarioDao.findAll();
	}

	
}
