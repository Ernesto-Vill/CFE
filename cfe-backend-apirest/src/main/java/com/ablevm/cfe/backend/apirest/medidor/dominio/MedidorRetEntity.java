package com.ablevm.cfe.backend.apirest.medidor.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medidorr")
public class MedidorRetEntity implements Serializable {
	
	@Id
	@Column(name = "Id_MedR", columnDefinition = "int(11)", nullable = false, unique = true)
	private String id_Medr;
	@Column(name = "Ns_MedR", columnDefinition = "varchar(7)", nullable = false, unique = false)
	private String ns_Medr;
	@Column(name = "Lec_MedR", columnDefinition = "varchar(4)", nullable = false, unique = false)
	private String lec_Medr;
	@Column(name = "NoCar_MedR", columnDefinition = "varchar(4)", nullable = true, unique = false)
	private String noCar_Medr;
	@Column(name = "CodLot_MedR", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String cod_Medr;
	@Column(name = "Mult_MedR", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String mult_Medr;
	@Column(name = "NoSeInt_MedR", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String noSeInt_Medr;
	
	public String getId_Medr() {
		return id_Medr;
	}



	public void setId_Medr(String id_Medr) {
		this.id_Medr = id_Medr;
	}



	public String getNs_Medr() {
		return ns_Medr;
	}



	public void setNs_Medr(String ns_Medr) {
		this.ns_Medr = ns_Medr;
	}



	public String getLec_Medr() {
		return lec_Medr;
	}



	public void setLec_Medr(String lec_Medr) {
		this.lec_Medr = lec_Medr;
	}



	public String getNoCar_Medr() {
		return noCar_Medr;
	}



	public void setNoCar_Medr(String noCar_Medr) {
		this.noCar_Medr = noCar_Medr;
	}



	public String getCod_Medr() {
		return cod_Medr;
	}



	public void setCod_Medr(String cod_Medr) {
		this.cod_Medr = cod_Medr;
	}



	public String getMult_Medr() {
		return mult_Medr;
	}



	public void setMult_Medr(String mult_Medr) {
		this.mult_Medr = mult_Medr;
	}



	public String getNoSeInt_Medr() {
		return noSeInt_Medr;
	}



	public void setNoSeInt_Medr(String noSeInt_Medr) {
		this.noSeInt_Medr = noSeInt_Medr;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}