package com.ablevm.cfe.backend.apirest.trabajo.dominio;
// default package
// Generated 26 jul 2020 1:13:31 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * Trabajo generated by hbm2java
 */
@Entity
@Table(name = "trabajo", catalog = "mydb")
public class Trabajo implements java.io.Serializable {

	private int idTrab;
	private String nomTrab;
	private String desTrab;


	public Trabajo() {
	}

	public Trabajo(int idTrab, String nomTrab, String desTrab) {
		this.idTrab = idTrab;
		this.nomTrab = nomTrab;
		this.desTrab = desTrab;
	}


	@Id

	@Column(name = "Id_Trab", unique = true, nullable = false)
	public int getIdTrab() {
		return this.idTrab;
	}

	public void setIdTrab(int idTrab) {
		this.idTrab = idTrab;
	}

	@Column(name = "Nom_Trab", nullable = false, length = 20)
	public String getNomTrab() {
		return this.nomTrab;
	}

	public void setNomTrab(String nomTrab) {
		this.nomTrab = nomTrab;
	}

	@Column(name = "Des_Trab", nullable = false, length = 45)
	public String getDesTrab() {
		return this.desTrab;
	}

	public void setDesTrab(String desTrab) {
		this.desTrab = desTrab;
	}

}
