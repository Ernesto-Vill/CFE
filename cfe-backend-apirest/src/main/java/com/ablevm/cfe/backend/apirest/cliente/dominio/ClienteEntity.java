package com.ablevm.cfe.backend.apirest.cliente.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

	@Id
	@Column(name = "Id_Client", columnDefinition = "varchar(13)", nullable = false, unique = true)
	private String idClient;
	@Column(name = "ApPa_Client", columnDefinition = "varchar(15)", nullable = true, unique = false)
	private String apPaClient;
	@Column(name = "ApMa_Client", columnDefinition = "varchar(15)", nullable = true, unique = false)
	private String apMaClient;
	@Column(name = "Nom_Client", columnDefinition = "varchar(25)", nullable = true, unique = false)
	private String nomClient;
	@Column(name = "Tel_Client", columnDefinition = "varchar(10)", nullable = true, unique = false)
	private String telClient;
	@Column(name = "Email_Client", columnDefinition = "varchar(45)", nullable = true, unique = false)
	private String emailClient;

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getApPaClient() {
		return apPaClient;
	}

	public void setApPaClient(String apPaClient) {
		this.apPaClient = apPaClient;
	}

	public String getApMaClient() {
		return apMaClient;
	}

	public void setApMaClient(String apMaClient) {
		this.apMaClient = apMaClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	private static final long serialVersionUID = 1L;

}
