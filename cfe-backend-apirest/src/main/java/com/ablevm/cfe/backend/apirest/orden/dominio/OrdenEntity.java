package com.ablevm.cfe.backend.apirest.orden.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "orden")
public class OrdenEntity implements Serializable {

	@Id
	@Column(name = "Id_Ord", length = 5, nullable = false, unique = true)
	private String idOrd;
	@Column(name = "No_Ord", columnDefinition = "nvarchar(5)", nullable = true, unique = true)
	private int noOrd;
	@Column(name = "Fech_Ord", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechOrd;
	@Column(name = "Rpu_Ord")
	private int repuOrd;
	@Column(name = "NCuen_Ord", nullable = false)
	private String nCuentOrd;
	@Column(name = "Tarifa_Ord", nullable = false)
	private int tarifaOrd;
	@Column(name = "T02_Ord")
	private String t02Ord;
	@Column(name = "Giro_Ord")
	private String giroOrd;
	@Column(name = "Hilos_Ord")
	private String hilosOrd;
	@Column(name = "Fase_Ord")
	private String faseOrd;
	@Column(name = "Anom_Ord")
	private String anom_Ord;
	@Column(name = "MedIqz_Ord")
	private String medIqzOrd;
	@Column(name = "MedDer_Ord")
	private String medDerOrd;
	@Column(name = "HoraInc_Ord")
	@Temporal(TemporalType.TIME)
	private Date horaIncOrd;
	@Column(name = "HoraFin_Ord")
	@Temporal(TemporalType.TIME)
	private Date horaFinOrd;
	@Column(name = "Atend_Ord", nullable = false)
	private String atendOrd;
	@Column(name = "Resib_Ord")
	private String resibOrd;
	@Column(name = "Rpe_Ord")
	private String rpeOrd;
	@Column(name = "IdentN_Ord")
	private String identNOrd;

	public String getIdOrd() {
		return idOrd;
	}

	public void setIdOrd(String idOrd) {
		this.idOrd = idOrd;
	}

	public int getNoOrd() {
		return noOrd;
	}

	public void setNoOrd(int noOrd) {
		this.noOrd = noOrd;
	}

	public Date getFechOrd() {
		return fechOrd;
	}

	public void setFechOrd(Date fechOrd) {
		this.fechOrd = fechOrd;
	}

	public int getRepuOrd() {
		return repuOrd;
	}

	public void setRepuOrd(int repuOrd) {
		this.repuOrd = repuOrd;
	}

	public String getnCuentOrd() {
		return nCuentOrd;
	}

	public void setnCuentOrd(String nCuentOrd) {
		this.nCuentOrd = nCuentOrd;
	}

	public int getTarifaOrd() {
		return tarifaOrd;
	}

	public void setTarifaOrd(int tarifaOrd) {
		this.tarifaOrd = tarifaOrd;
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
