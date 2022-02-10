package com.ablevm.cfe.backend.apirest.material.dominio;
// default package
// Generated 26 jul 2020 1:13:31 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.ablevm.cfe.backend.apirest.orden.dominio.Orden;

/**
 * MaterialDesmantelado generated by hbm2java
 */
@Entity
@Table(name = "material_desmantelado", catalog = "mydb", uniqueConstraints = @UniqueConstraint(columnNames = "Id_MatD"))
public class MaterialDesmantelado implements java.io.Serializable {

	private MaterialDesmanteladoId id;
	private Material material;
	private Orden orden;
	private double cantMat;

	public MaterialDesmantelado() {
	}

	public MaterialDesmantelado(MaterialDesmanteladoId id, Material material, Orden orden, double cantMat) {
		this.id = id;
		this.material = material;
		this.orden = orden;
		this.cantMat = cantMat;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idMatD", column = @Column(name = "Id_MatD", unique = true, nullable = false, length = 7)),
			@AttributeOverride(name = "ordenIdOrd", column = @Column(name = "Orden_Id_Ord", nullable = false, length = 5)),
			@AttributeOverride(name = "materialIdMat", column = @Column(name = "Material_Id_Mat", nullable = false)) })
	public MaterialDesmanteladoId getId() {
		return this.id;
	}

	public void setId(MaterialDesmanteladoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Material_Id_Mat", nullable = false, insertable = false, updatable = false)
	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Orden_Id_Ord", nullable = false, insertable = false, updatable = false)
	public Orden getOrden() {
		return this.orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	@Column(name = "Cant_Mat", nullable = false, precision = 22, scale = 0)
	public double getCantMat() {
		return this.cantMat;
	}

	public void setCantMat(double cantMat) {
		this.cantMat = cantMat;
	}

}