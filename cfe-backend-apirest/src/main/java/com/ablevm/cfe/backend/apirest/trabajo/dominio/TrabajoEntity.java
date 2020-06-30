package com.ablevm.cfe.backend.apirest.trabajo.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajo")
public class TrabajoEntity implements Serializable{


	@Id
	@Column(name = "Id_Trab", columnDefinition = "Int(2)", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrab;
	
	@Column(name = "Nom_Trab", columnDefinition = "varchar(20)", nullable = false, unique = true)
	private String nomTrab;
	
	@Column(name = "Des_Trab", columnDefinition = "varchar(45)", nullable = false, unique = false)
	private String desTrab;
	


	public Long getIdTrab() {
		return idTrab;
	}



	public void setIdTrab(Long idTrab) {
		this.idTrab = idTrab;
	}



	public String getNomTrab() {
		return nomTrab;
	}



	public void setNomTrab(String nomTrab) {
		this.nomTrab = nomTrab;
	}



	public String getDesTrab() {
		return desTrab;
	}



	public void setDesTrab(String desTrab) {
		this.desTrab = desTrab;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
