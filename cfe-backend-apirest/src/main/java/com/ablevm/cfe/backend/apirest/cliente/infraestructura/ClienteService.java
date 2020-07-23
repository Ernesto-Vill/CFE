package com.ablevm.cfe.backend.apirest.cliente.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.cliente.dominio.ClienteEntity;

public interface ClienteService {
	
	public List<ClienteEntity>findAll();
	public void save(ClienteEntity clienteEntity);
	public ClienteEntity findById(String id);
	public void delete(ClienteEntity clienteEntity);
}
