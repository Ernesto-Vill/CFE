package com.ablevm.cfe.backend.apirest.agencia.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class AgenciaEntity implements Serializable {

	@Id
	@Column(name = "Id_Age", nullable = false, unique = true)
	private String idAge;
	@Column(name = "Nom_Age", nullable = false, unique = false)
	private String nomAge;

	public String getIdAge() {
		return idAge;
	}

	public void setIdAge(String idAge) {
		this.idAge = idAge;
	}

	public String getNomAge() {
		return nomAge;
	}

	public void setNomAge(String nomAge) {
		this.nomAge = nomAge;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
