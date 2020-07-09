package com.ablevm.cfe.backend.apirest.medidor.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medidori")
public class MedidorIngEntity implements Serializable {
	

	@Id
	@Column(name = "Id_MedI", columnDefinition = "int(11)", nullable = false, unique = true)
	private String id_Medi;
	@Column(name = "Ns_MedI", columnDefinition = "varchar(7)", nullable = false, unique = false)
	private String ns_Medi;
	@Column(name = "Lec_MedI", columnDefinition = "varchar(4)", nullable = false, unique = false)
	private String lec_Medi;
	@Column(name = "NoCar_MedI", columnDefinition = "varchar(4)", nullable = true, unique = false)
	private String noCar_Medi;
	@Column(name = "CodLot_MedI", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String cod_Medi;
	@Column(name = "Mult_MedI", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String mult_Medi;
	@Column(name = "NoSeInt_MedI", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String noSeInt_Medi;
	public String getId_Medi() {
		return id_Medi;
	}
	public void setId_Medi(String id_Medi) {
		this.id_Medi = id_Medi;
	}
	public String getNs_Medi() {
		return ns_Medi;
	}
	public void setNs_Medi(String ns_Medi) {
		this.ns_Medi = ns_Medi;
	}
	public String getLec_Medi() {
		return lec_Medi;
	}
	public void setLec_Medi(String lec_Medi) {
		this.lec_Medi = lec_Medi;
	}
	public String getNoCar_Medi() {
		return noCar_Medi;
	}
	public void setNoCar_Medi(String noCar_Medi) {
		this.noCar_Medi = noCar_Medi;
	}
	public String getCod_Medi() {
		return cod_Medi;
	}
	public void setCod_Medi(String cod_Medi) {
		this.cod_Medi = cod_Medi;
	}
	public String getMult_Medi() {
		return mult_Medi;
	}
	public void setMult_Medi(String mult_Medi) {
		this.mult_Medi = mult_Medi;
	}
	public String getNoSeInt_Medi() {
		return noSeInt_Medi;
	}
	public void setNoSeInt_Medi(String noSeInt_Medi) {
		this.noSeInt_Medi = noSeInt_Medi;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
