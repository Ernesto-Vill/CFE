package com.ablevm.cfe.backend.apirest.cliente.dominio;
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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "mydb")
public class Cliente implements java.io.Serializable {

	private String idClient;
	private String apPaClient;
	private String apMaClient;
	private String nomClient;
	private String telClient;
	private String emailClient;

	public Cliente() {
	}

	public Cliente(String idClient, String apPaClient, String apMaClient, String nomClient) {
		this.idClient = idClient;
		this.apPaClient = apPaClient;
		this.apMaClient = apMaClient;
		this.nomClient = nomClient;
	}

	public Cliente(String idClient, String apPaClient, String apMaClient, String nomClient, String telClient,
			String emailClient) {
		this.idClient = idClient;
		this.apPaClient = apPaClient;
		this.apMaClient = apMaClient;
		this.nomClient = nomClient;
		this.telClient = telClient;
		this.emailClient = emailClient;
	}

	@Id

	@Column(name = "Id_Client", unique = true, nullable = false, length = 13)
	public String getIdClient() {
		return this.idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	@Column(name = "ApPa_Client", nullable = false, length = 15)
	public String getApPaClient() {
		return this.apPaClient;
	}

	public void setApPaClient(String apPaClient) {
		this.apPaClient = apPaClient;
	}

	@Column(name = "ApMa_Client", nullable = false, length = 15)
	public String getApMaClient() {
		return this.apMaClient;
	}

	public void setApMaClient(String apMaClient) {
		this.apMaClient = apMaClient;
	}

	@Column(name = "Nom_Client", nullable = false, length = 25)
	public String getNomClient() {
		return this.nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	@Column(name = "Tel_Client", length = 10)
	public String getTelClient() {
		return this.telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	@Column(name = "Email_Client", length = 45)
	public String getEmailClient() {
		return this.emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}


}