package com.ablevm.cfe.backend.apirest.usuario.dominio;

import com.ablevm.cfe.backend.apirest.role.dominio.*;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable{


	@Id
	@Column(name = "Id_Usu",columnDefinition="varchar(10)", nullable = false, unique = true)
	private String idUsu;
	
	@Column(name = "UserName_Usu",columnDefinition="varchar(10)", nullable = false, unique = true)
	private String userNameUsu;
	
	@Column(name = "Nom_Usu",columnDefinition="varchar(25)", nullable = false, unique = false)
	private String nomUsu;
	
	@Column(name = "ApPa_Usu",columnDefinition="varchar(15)", nullable = false, unique = false)
	private String apPaUsu;
	
	@Column(name = "ApMa_Usu",columnDefinition="varchar(15)", nullable = false, unique = false)
	private String apMaUsu;
	
	@Column(name = "Pass_Usu",columnDefinition="varchar(16)", nullable = false, unique = false)
	private String passUsu;
	
    @ManyToMany
    private List <RoleEntity> roles;
	
	public String getIdUsu() {
		return idUsu;
	}


	public void setIdUsu(String idUsu) {
		this.idUsu = idUsu;
	}


	public String getUserNameUsu() {
		return userNameUsu;
	}


	public void setUserNameUsu(String userNameUsu) {
		this.userNameUsu = userNameUsu;
	}


	public String getNomUsu() {
		return nomUsu;
	}


	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}


	public String getApPaUsu() {
		return apPaUsu;
	}


	public void setApPaUsu(String apPaUsu) {
		this.apPaUsu = apPaUsu;
	}


	public String getApMaUsu() {
		return apMaUsu;
	}


	public void setApMaUsu(String apMaUsu) {
		this.apMaUsu = apMaUsu;
	}


	public String getPassUsu() {
		return passUsu;
	}


	public void setPassUsu(String passUsu) {
		this.passUsu = passUsu;
	}


	public List<RoleEntity> getRoles() {
		return roles;
	}


	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
