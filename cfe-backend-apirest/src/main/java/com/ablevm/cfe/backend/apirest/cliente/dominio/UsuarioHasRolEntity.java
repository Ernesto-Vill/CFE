package com.ablevm.cfe.backend.apirest.cliente.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class UsuarioHasRolEntity implements Serializable {

	@Id
	@Column(name = "IdClient", length = 13, nullable = false, unique = false)
	private String idClient;
	@Id
	@Column(name = "Id_Rol", columnDefinition = "int(3)", nullable = false, unique = false)
	private int idRol;

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	private static final long serialVersionUID = 1L;
}
