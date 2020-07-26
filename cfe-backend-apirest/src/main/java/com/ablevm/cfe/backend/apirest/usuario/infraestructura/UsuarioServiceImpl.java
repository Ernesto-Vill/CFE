package com.ablevm.cfe.backend.apirest.usuario.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.usuario.dominio.Usuario;

@Service

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired

	private UsuarioDao usuarioDao;

	@Override

	@Transactional(readOnly = true)

	public List<Usuario> findAll() {

		return (List<Usuario>) usuarioDao.findAll();

	}

	@Override

	@Transactional

	public void save(Usuario usuario) {

		usuarioDao.save(usuario);

	}

	@Override

	@Transactional(readOnly = true)

	public Usuario findById(String id) {

		return usuarioDao.findById(id).orElse(null);

	}

	@Override

	@Transactional

	public void delete(Usuario usuario) {

		usuarioDao.delete(usuario);

	}

}