package com.ablevm.cfe.backend.apirest.orden.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Material_Ocupado")
public class MaterialOcupadoEntity {
	@Id
	@Column(name = "Id_Ord", length = 5, nullable = false, unique = false)
	private String idOrd;
	// @Id
	@Column(name = "Id_Mat", columnDefinition = "int(3)", nullable = false, unique = false)
	private int idMat;
	@Column(name = "Cant_Mat", columnDefinition = "int(6)", nullable = false, unique = false)
	private int cant_mat;

}
