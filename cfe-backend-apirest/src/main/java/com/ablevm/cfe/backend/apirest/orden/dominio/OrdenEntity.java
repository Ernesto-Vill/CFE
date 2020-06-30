package com.ablevm.cfe.backend.apirest.orden.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "orden")
public class OrdenEntity implements Serializable {

	@Id
	@Column(name = "Id_Ord", columnDefinition = "varchar(5)", nullable = false, unique = true)
	private String idOrd;
	@Column(name = "No_Ord", columnDefinition = "varchar(3)", nullable = true, unique = true)
	private Long noOrd;
	@Column(name = "Fech_Ord", nullable = false, unique = false)
	@Temporal(TemporalType.DATE)
	private Date fechOrd;
	@Column(name = "Rpu_Ord", columnDefinition = "Int", nullable = false, unique = false)
	private Long repuOrd;
	@Column(name = "NCuen_Ord", columnDefinition = "varchar(17)", nullable = false, unique = false)
	private String nCuentOrd;
	@Column(name = "Tarifa_Ord", columnDefinition = "Int", nullable = false, unique = false)
	private Long tarifaOrd;
	@Column(name = "T02_Ord", columnDefinition = "varchar(4)", nullable = true, unique = false)
	private String t02Ord;
	@Column(name = "Giro_Ord", columnDefinition = "varchar(4)", nullable = true, unique = false)
	private String giroOrd;
	@Column(name = "Hilos_Ord", columnDefinition = "varchar(2)", nullable = true, unique = false)
	private String hilosOrd;
	@Column(name = "Fase_Ord", columnDefinition = "varchar(2)", nullable = true, unique = false)
	private String faseOrd;
	@Column(name = "Anom_Ord", columnDefinition = "varchar(40)", nullable = true, unique = false)
	private String anom_Ord;
	@Column(name = "MedIqz_Ord", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String medIqzOrd;
	@Column(name = "MedDer_Ord", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String medDerOrd;
	@Column(name = "HoraInc_Ord", nullable = true, unique = false)
	@Temporal(TemporalType.TIME)
	private Date horaIncOrd;
	@Column(name = "HoraFin_Ord", nullable = true, unique = false)
	@Temporal(TemporalType.TIME)
	private Date horaFinOrd;
	@Column(name = "Atend_Ord", columnDefinition = "varchar(45)", nullable = false, unique = false)
	private String atendOrd;
	@Column(name = "Resib_Ord", columnDefinition = "varchar(45)", nullable = true, unique = false)
	private String resibOrd;
	@Column(name = "Rpe_Ord", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String rpeOrd;
	@Column(name = "IdentN_Ord", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String identNOrd;

	public String getIdOrd() {
		return idOrd;
	}

	public void setIdOrd(String idOrd) {
		this.idOrd = idOrd;
	}

	public Long getNoOrd() {
		return noOrd;
	}

	public void setNoOrd(Long noOrd) {
		this.noOrd = noOrd;
	}

	public void setRepuOrd(Long repuOrd) {
		this.repuOrd = repuOrd;
	}

	public void setTarifaOrd(Long tarifaOrd) {
		this.tarifaOrd = tarifaOrd;
	}

	public Date getFechOrd() {
		return fechOrd;
	}

	public void setFechOrd(Date fechOrd) {
		this.fechOrd = fechOrd;
	}

	public Long getRepuOrd() {
		return repuOrd;
	}

	public Long getTarifaOrd() {
		return tarifaOrd;
	}

	public String getnCuentOrd() {
		return nCuentOrd;
	}

	public void setnCuentOrd(String nCuentOrd) {
		this.nCuentOrd = nCuentOrd;
	}

	public String getT02Ord() {
		return t02Ord;
	}

	public void setT02Ord(String t02Ord) {
		this.t02Ord = t02Ord;
	}

	public String getGiroOrd() {
		return giroOrd;
	}

	public void setGiroOrd(String giroOrd) {
		this.giroOrd = giroOrd;
	}

	public String getHilosOrd() {
		return hilosOrd;
	}

	public void setHilosOrd(String hilosOrd) {
		this.hilosOrd = hilosOrd;
	}

	public String getFaseOrd() {
		return faseOrd;
	}

	public void setFaseOrd(String faseOrd) {
		this.faseOrd = faseOrd;
	}

	public String getAnom_Ord() {
		return anom_Ord;
	}

	public void setAnom_Ord(String anom_Ord) {
		this.anom_Ord = anom_Ord;
	}

	public String getMedIqzOrd() {
		return medIqzOrd;
	}

	public void setMedIqzOrd(String medIqzOrd) {
		this.medIqzOrd = medIqzOrd;
	}

	public String getMedDerOrd() {
		return medDerOrd;
	}

	public void setMedDerOrd(String medDerOrd) {
		this.medDerOrd = medDerOrd;
	}

	public Date getHoraIncOrd() {
		return horaIncOrd;
	}

	public void setHoraIncOrd(Date horaIncOrd) {
		this.horaIncOrd = horaIncOrd;
	}

	public Date getHoraFinOrd() {
		return horaFinOrd;
	}

	public void setHoraFinOrd(Date horaFinOrd) {
		this.horaFinOrd = horaFinOrd;
	}

	public String getAtendOrd() {
		return atendOrd;
	}

	public void setAtendOrd(String atendOrd) {
		this.atendOrd = atendOrd;
	}

	public String getResibOrd() {
		return resibOrd;
	}

	public void setResibOrd(String resibOrd) {
		this.resibOrd = resibOrd;
	}

	public String getRpeOrd() {
		return rpeOrd;
	}

	public void setRpeOrd(String rpeOrd) {
		this.rpeOrd = rpeOrd;
	}

	public String getIdentNOrd() {
		return identNOrd;
	}

	public void setIdentNOrd(String identNOrd) {
		this.identNOrd = identNOrd;
	}

	private static final long serialVersionUID = 1L;

}
