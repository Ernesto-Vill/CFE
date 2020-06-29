package com.ablevm.cfe.backend.apirest.ubicacion.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ubicacion")
public class UbicacionEntity implements Serializable {


	@Id
	@Column(name = "Id_Ubi", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUbi;
	
	@Column(name = "Call_Ubi", nullable = false, unique = false)
	private String callUbi;
	
	@Column(name = "NoExt_Ubi", nullable = false, unique = false)
	private String noExtUbi;
	
	@Column(name = "NoInt_Ubi", nullable = true, unique = false)
	private String noIntUbi;
	
	@Column(name = "Col_Ubi", nullable = false, unique = false)
	private String colUbi;
	
	@Column(name = "Mun_Ubi", nullable = false, unique = false)
	private String munUbi;
	
	@Column(name = "EntrCall_Ubi", nullable = true, unique = false)
	private String entrCallUbi;
	
	@Column(name = "Ref_Ubi", nullable = true, unique = false)
	private String refUbi;
	
	@Column(name = "Geo_Ubi", nullable = true, unique = false)
	private String geoUbi;
	
	
	
	public int getIdUbi() {
		return idUbi;
	}



	public void setIdUbi(int idUbi) {
		this.idUbi = idUbi;
	}



	public String getCallUbi() {
		return callUbi;
	}



	public void setCallUbi(String callUbi) {
		this.callUbi = callUbi;
	}



	public String getNoExtUbi() {
		return noExtUbi;
	}



	public void setNoExtUbi(String noExtUbi) {
		this.noExtUbi = noExtUbi;
	}



	public String getNoIntUbi() {
		return noIntUbi;
	}



	public void setNoIntUbi(String noIntUbi) {
		this.noIntUbi = noIntUbi;
	}



	public String getColUbi() {
		return colUbi;
	}



	public void setColUbi(String colUbi) {
		this.colUbi = colUbi;
	}



	public String getMunUbi() {
		return munUbi;
	}



	public void setMunUbi(String munUbi) {
		this.munUbi = munUbi;
	}



	public String getEntrCallUbi() {
		return entrCallUbi;
	}



	public void setEntrCallUbi(String entrCallUbi) {
		this.entrCallUbi = entrCallUbi;
	}



	public String getRefUbi() {
		return refUbi;
	}



	public void setRefUbi(String refUbi) {
		this.refUbi = refUbi;
	}



	public String getGeoUbi() {
		return geoUbi;
	}



	public void setGeoUbi(String geoUbi) {
		this.geoUbi = geoUbi;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
