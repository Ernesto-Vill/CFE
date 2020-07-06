package com.ablevm.cfe.backend.apirest.zona.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zona")
public class ZonaEntity implements Serializable {

	@Id
	@Column(name = "Id_Zon", columnDefinition = "Int(3)", nullable = false, unique = true)
	private Long idZon;
	@Column(name = "Nom_Zon", columnDefinition = "NVARCHAR(45)", nullable = false, unique = true)
	private String nomZon;

	
	public Long getIdZon() {
		return idZon;
	}

	public void setIdZon(Long idZon) {
		this.idZon = idZon;
	}

	public String getNomZon() {
		return nomZon;
	}

	public void setNomZon(String nomZon) {
		this.nomZon = nomZon;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}