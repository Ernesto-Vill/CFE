
package com.ablevm.cfe.backend.apirest.usuario.infraestructura;

import org.springframework.data.repository.CrudRepository;

import com.ablevm.cfe.backend.apirest.usuario.dominio.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario,String> {



}