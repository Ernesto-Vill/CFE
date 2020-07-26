package com.ablevm.cfe.backend.apirest.material.dominio;
// default package
// Generated 26 jul 2020 1:13:31 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaterialDesmanteladoId generated by hbm2java
 */
@Embeddable
public class MaterialDesmanteladoId implements java.io.Serializable {

	private String idMatD;
	private String ordenIdOrd;
	private int materialIdMat;

	public MaterialDesmanteladoId() {
	}

	public MaterialDesmanteladoId(String idMatD, String ordenIdOrd, int materialIdMat) {
		this.idMatD = idMatD;
		this.ordenIdOrd = ordenIdOrd;
		this.materialIdMat = materialIdMat;
	}

	@Column(name = "Id_MatD", unique = true, nullable = false, length = 7)
	public String getIdMatD() {
		return this.idMatD;
	}

	public void setIdMatD(String idMatD) {
		this.idMatD = idMatD;
	}

	@Column(name = "Orden_Id_Ord", nullable = false, length = 5)
	public String getOrdenIdOrd() {
		return this.ordenIdOrd;
	}

	public void setOrdenIdOrd(String ordenIdOrd) {
		this.ordenIdOrd = ordenIdOrd;
	}

	@Column(name = "Material_Id_Mat", nullable = false)
	public int getMaterialIdMat() {
		return this.materialIdMat;
	}

	public void setMaterialIdMat(int materialIdMat) {
		this.materialIdMat = materialIdMat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaterialDesmanteladoId))
			return false;
		MaterialDesmanteladoId castOther = (MaterialDesmanteladoId) other;

		return ((this.getIdMatD() == castOther.getIdMatD()) || (this.getIdMatD() != null
				&& castOther.getIdMatD() != null && this.getIdMatD().equals(castOther.getIdMatD())))
				&& ((this.getOrdenIdOrd() == castOther.getOrdenIdOrd()) || (this.getOrdenIdOrd() != null
						&& castOther.getOrdenIdOrd() != null && this.getOrdenIdOrd().equals(castOther.getOrdenIdOrd())))
				&& (this.getMaterialIdMat() == castOther.getMaterialIdMat());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdMatD() == null ? 0 : this.getIdMatD().hashCode());
		result = 37 * result + (getOrdenIdOrd() == null ? 0 : this.getOrdenIdOrd().hashCode());
		result = 37 * result + this.getMaterialIdMat();
		return result;
	}

}
