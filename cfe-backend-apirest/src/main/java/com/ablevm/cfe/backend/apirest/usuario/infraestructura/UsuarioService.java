package com.ablevm.cfe.backend.apirest.usuario.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.usuario.dominio.UsuarioEntity;

public interface UsuarioService {
 
	public List<UsuarioEntity>findAll();
	public void save(UsuarioEntity usuarioEntity);
	public UsuarioEntity findById(String id);
	public void delete(UsuarioEntity usuarioEntity);
}
