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
	@Column(name = "Id_Mat", columnDefinition = "Int(3)", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMat;
	@Column(name = "Nom_Mat", columnDefinition = "varchar(45)", nullable = false, unique = false)
	private String nomMat;
	@Column(name = "Uni_Mat", columnDefinition = "varchar(15)", nullable = false, unique = false)
	private String uniMat;
	@Column(name = "Desc_Mat", columnDefinition = "varchar(45)", nullable = true, unique = false)
	private String descMat;


	public Long getIdMat() {
		return idMat;
	}

	public void setIdMat(Long idMat) {
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
