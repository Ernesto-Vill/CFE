package com.ablevm.cfe.backend.apirest.ubicacion.dominio;
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
 * Ubicacion generated by hbm2java
 */
@Entity
@Table(name = "ubicacion", catalog = "mydb")
public class Ubicacion implements java.io.Serializable {

	private int idUbi;
	private String callUbi;
	private String noExtUbi;
	private String noIntUbi;
	private String colUbi;
	private String munUbi;
	private String entrCallUbi;
	private String refUbi;
	private String geoUbi;

	public Ubicacion() {
	}

	public Ubicacion(int idUbi, String callUbi, String noExtUbi, String colUbi, String munUbi) {
		this.idUbi = idUbi;
		this.callUbi = callUbi;
		this.noExtUbi = noExtUbi;
		this.colUbi = colUbi;
		this.munUbi = munUbi;
	}

	public Ubicacion(int idUbi, String callUbi, String noExtUbi, String noIntUbi, String colUbi, String munUbi,
			String entrCallUbi, String refUbi, String geoUbi) {
		this.idUbi = idUbi;
		this.callUbi = callUbi;
		this.noExtUbi = noExtUbi;
		this.noIntUbi = noIntUbi;
		this.colUbi = colUbi;
		this.munUbi = munUbi;
		this.entrCallUbi = entrCallUbi;
		this.refUbi = refUbi;
		this.geoUbi = geoUbi;
	}

	@Id

	@Column(name = "Id_Ubi", unique = true, nullable = false)
	public int getIdUbi() {
		return this.idUbi;
	}

	public void setIdUbi(int idUbi) {
		this.idUbi = idUbi;
	}

	@Column(name = "Call_Ubi", nullable = false, length = 45)
	public String getCallUbi() {
		return this.callUbi;
	}

	public void setCallUbi(String callUbi) {
		this.callUbi = callUbi;
	}

	@Column(name = "NoExt_Ubi", nullable = false, length = 10)
	public String getNoExtUbi() {
		return this.noExtUbi;
	}

	public void setNoExtUbi(String noExtUbi) {
		this.noExtUbi = noExtUbi;
	}

	@Column(name = "NoInt_Ubi", length = 10)
	public String getNoIntUbi() {
		return this.noIntUbi;
	}

	public void setNoIntUbi(String noIntUbi) {
		this.noIntUbi = noIntUbi;
	}

	@Column(name = "Col_Ubi", nullable = false, length = 35)
	public String getColUbi() {
		return this.colUbi;
	}

	public void setColUbi(String colUbi) {
		this.colUbi = colUbi;
	}

	@Column(name = "Mun_Ubi", nullable = false, length = 35)
	public String getMunUbi() {
		return this.munUbi;
	}

	public void setMunUbi(String munUbi) {
		this.munUbi = munUbi;
	}

	@Column(name = "EntrCall_Ubi", length = 40)
	public String getEntrCallUbi() {
		return this.entrCallUbi;
	}

	public void setEntrCallUbi(String entrCallUbi) {
		this.entrCallUbi = entrCallUbi;
	}

	@Column(name = "Ref_Ubi", length = 45)
	public String getRefUbi() {
		return this.refUbi;
	}

	public void setRefUbi(String refUbi) {
		this.refUbi = refUbi;
	}

	@Column(name = "Geo_Ubi", length = 25)
	public String getGeoUbi() {
		return this.geoUbi;
	}

	public void setGeoUbi(String geoUbi) {
		this.geoUbi = geoUbi;
	}


}