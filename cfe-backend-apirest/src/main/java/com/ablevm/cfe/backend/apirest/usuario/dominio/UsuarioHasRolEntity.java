package com.ablevm.cfe.backend.apirest.usuario.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario_has_Rol")
public class UsuarioHasRolEntity implements Serializable {

	@Id
	@Column(name = "Id_Usu",columnDefinition="varchar(10)", nullable = false, unique = false)
	private String idUsu;

	@Column(name = "Id_Rol",columnDefinition="int(3)", nullable = false, unique = false)
	private int idRol;

	private static final long serialVersionUID = 1L;
}
