package com.ablevm.cfe.backend.apirest.cliente.infraestructura;

import java.util.List;

import com.ablevm.cfe.backend.apirest.cliente.dominio.Cliente;

public interface ClienteService {
	
	public List<Cliente>findAll();
	public void save(Cliente cliente);
	public Cliente findById(String id);
	public void delete(Cliente cliente);
}
