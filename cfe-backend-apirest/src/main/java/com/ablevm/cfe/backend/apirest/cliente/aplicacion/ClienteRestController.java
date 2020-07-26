package com.ablevm.cfe.backend.apirest.cliente.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.cliente.dominio.Cliente;
import com.ablevm.cfe.backend.apirest.cliente.infraestructura.ClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@Validated
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/cliente")
	public List<Cliente>index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente show(@PathVariable String id) {
		return this.clienteService.findById(id);
	}

	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		this.clienteService.save(cliente);
		
		return cliente;
	}

	@PutMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable String id) {
		Cliente currentCliente = this.clienteService.findById(id);
		currentCliente.setNomClient(cliente.getNomClient());
		currentCliente.setApPaClient(cliente.getApPaClient());
		currentCliente.setApMaClient(cliente.getApMaClient());
		currentCliente.setEmailClient(cliente.getEmailClient());
		currentCliente.setTelClient(cliente.getTelClient());
		this.clienteService.save(currentCliente);
		return currentCliente;
	}

	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		Cliente currentCliente = this.clienteService.findById(id);
		this.clienteService.delete(currentCliente);
	}
	
}