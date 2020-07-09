package com.ablevm.cfe.backend.apirest.orden.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ablevm.cfe.backend.apirest.material.dominio.MaterialEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Material_Ocupado")
public class MaterialOcupadoEntity implements Serializable {
	//public MaterialDesmanteladoEntity(OrdenEntity orden) {
		//final int conteo=0;
		//String idMatDesm = orden.getIdOrd()+conteo;
	//}
	@Id
	@Column(name = "Id_MatO", columnDefinition = "varchar(7)", nullable = false, unique = true)
	private String idMatO;
	
	@Column(name = "Cant_Mat", columnDefinition = "double(6)", nullable = false, unique = false)
	private int cant_mat;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "Material_Id_Mat")
	private MaterialEntity material;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler","orden" })
	@JoinColumn(name = "Orden_Id_ord")
	@JsonIgnore
	private OrdenEntity orden;
	
	public String getIdMatO() {
		return idMatO;
	}

	public void setIdMatO(String idMatO) {
		this.idMatO = idMatO;
	}




	public int getCant_mat() {
		return cant_mat;
	}




	public void setCant_mat(int cant_mat) {
		this.cant_mat = cant_mat;
	}




	public MaterialEntity getMaterial() {
		return material;
	}




	public void setMaterial(MaterialEntity material) {
		this.material = material;
	}

	public OrdenEntity getOrden() {
		return orden;
	}

	public void setOrden(OrdenEntity orden) {
		this.orden = orden;
	}

	private static final long serialVersionUID = 1L;
	
}
