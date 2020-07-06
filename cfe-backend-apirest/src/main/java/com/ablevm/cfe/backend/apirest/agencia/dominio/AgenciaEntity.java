package com.ablevm.cfe.backend.apirest.agencia.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class AgenciaEntity implements Serializable {

	@Id
	@Column(name = "Id_Age", columnDefinition = "Int(3)", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAge;
	@Column(name = "Nom_Age", columnDefinition = "varchar(45)", nullable = false, unique = true)
	private String nomAge;

	public Long getIdAge() {
		return idAge;
	}

	public void setIdAge(Long idAge) {
		this.idAge = idAge;
	}

	public String getNomAge() {
		return nomAge;
	}

	public void setNomAge(String nomAge) {
		this.nomAge = nomAge;
	}

	private static final long serialVersionUID = 1L;

}
