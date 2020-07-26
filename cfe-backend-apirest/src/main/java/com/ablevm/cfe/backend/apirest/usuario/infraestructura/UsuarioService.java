
package com.ablevm.cfe.backend.apirest.usuario.infraestructura;



import java.util.List;



import com.ablevm.cfe.backend.apirest.usuario.dominio.Usuario;



public interface UsuarioService {

 

	public List<Usuario>findAll();

	public void save(Usuario usuario);

	public Usuario findById(String id);

	public void delete(Usuario usuario);

}