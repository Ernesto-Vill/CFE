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

	@Override
	@Transactional
	public void save(UsuarioEntity usuarioEntity) {
		usuarioDao.save(usuarioEntity);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioEntity findById(String id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(UsuarioEntity usuarioEntity) {
		usuarioDao.delete(usuarioEntity);
		
	}
}
