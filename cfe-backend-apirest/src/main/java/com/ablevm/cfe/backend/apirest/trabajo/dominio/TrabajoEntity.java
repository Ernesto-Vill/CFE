package com.ablevm.cfe.backend.apirest.trabajo.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.ablevm.cfe.backend.apirest.usuario.dominio.UsuarioEntity;
import com.ablevm.cfe.backend.apirest.orden.dominio.*;

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
	

	@OneToMany(mappedBy = "trabajo")
	private List<OrdenEntity> ordenes;

	
	
	public List<OrdenEntity> getOrdenes() {
		return ordenes;
	}



	public void setOrdenes(List<OrdenEntity> ordenes) {
		this.ordenes = ordenes;
	}

	//@OneToMany(mappedBy = "trabajo")
	//@JsonManagedReference
    //private List<OrdenEntity> ordenes;



    //public List<OrdenEntity> getOrdenes() {
    //    return ordenes;
    //}



    //public void setOrdenes(List<OrdenEntity> ordenes) {
    //    this.ordenes = ordenes;
    //}



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
