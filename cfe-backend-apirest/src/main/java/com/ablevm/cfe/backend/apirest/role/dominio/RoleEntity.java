package com.ablevm.cfe.backend.apirest.role.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity implements Serializable{


	@Id
	@Column(name = "Id_Rol",columnDefinition="int(3)", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	
	@Column(name = "Nom_Rol",columnDefinition="varchar(16)", nullable = false, unique = false)
	private String nomRol;
	
	@Column(name = "Desc_Rol",columnDefinition="varchar(45)", nullable = false, unique = false)
	private String descRol;


	public int getIdRol() {
		return idRol;
	}


	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}


	public String getNomRol() {
		return nomRol;
	}


	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}


	public String getDescRol() {
		return descRol;
	}


	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
