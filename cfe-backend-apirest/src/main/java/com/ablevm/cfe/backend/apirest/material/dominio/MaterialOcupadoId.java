package com.ablevm.cfe.backend.apirest.material.dominio;
// default package
// Generated 26 jul 2020 1:13:31 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaterialOcupadoId generated by hbm2java
 */
@Embeddable
public class MaterialOcupadoId implements java.io.Serializable {

	private String idMatO;
	private String ordenIdOrd;
	private int materialIdMat;

	public MaterialOcupadoId() {
	}

	public MaterialOcupadoId(String idMatO, String ordenIdOrd, int materialIdMat) {
		this.idMatO = idMatO;
		this.ordenIdOrd = ordenIdOrd;
		this.materialIdMat = materialIdMat;
	}

	@Column(name = "Id_MatO", unique = true, nullable = false, length = 7)
	public String getIdMatO() {
		return this.idMatO;
	}

	public void setIdMatO(String idMatO) {
		this.idMatO = idMatO;
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
		if (!(other instanceof MaterialOcupadoId))
			return false;
		MaterialOcupadoId castOther = (MaterialOcupadoId) other;

		return ((this.getIdMatO() == castOther.getIdMatO()) || (this.getIdMatO() != null
				&& castOther.getIdMatO() != null && this.getIdMatO().equals(castOther.getIdMatO())))
				&& ((this.getOrdenIdOrd() == castOther.getOrdenIdOrd()) || (this.getOrdenIdOrd() != null
						&& castOther.getOrdenIdOrd() != null && this.getOrdenIdOrd().equals(castOther.getOrdenIdOrd())))
				&& (this.getMaterialIdMat() == castOther.getMaterialIdMat());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdMatO() == null ? 0 : this.getIdMatO().hashCode());
		result = 37 * result + (getOrdenIdOrd() == null ? 0 : this.getOrdenIdOrd().hashCode());
		result = 37 * result + this.getMaterialIdMat();
		return result;
	}

}