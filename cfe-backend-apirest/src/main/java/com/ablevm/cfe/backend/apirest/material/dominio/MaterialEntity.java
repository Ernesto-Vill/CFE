package com.ablevm.cfe.backend.apirest.material.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class MaterialEntity implements Serializable {

	@Id
	@Column(name = "Id_Mat", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMat;
	@Column(name = "Nom_Mat", nullable = false, unique = false)
	private String nomMat;
	@Column(name = "Uni_Mat", nullable = false, unique = false)
	private String uniMat;
	@Column(name = "Desc_Mat", nullable = false, unique = false)
	private String descMat;

	public int getIdMat() {
		return idMat;
	}

	public void setIdMat(int idMat) {
		this.idMat = idMat;
	}

	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public String getUniMat() {
		return uniMat;
	}

	public void setUniMat(String uniMat) {
		this.uniMat = uniMat;
	}

	public String getDescMat() {
		return descMat;
	}

	public void setDescMat(String descMat) {
		this.descMat = descMat;
	}

	private static final long serialVersionUID = 1L;
}
