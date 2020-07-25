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

import com.ablevm.cfe.backend.apirest.cliente.dominio.ClienteEntity;
import com.ablevm.cfe.backend.apirest.cliente.infraestructura.ClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@Validated
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/cliente")
	public List<ClienteEntity>index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public ClienteEntity show(@PathVariable String id) {
		return this.clienteService.findById(id);
	}

	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteEntity create(@RequestBody ClienteEntity clienteEntity) {
		this.clienteService.save(clienteEntity);
		
		return clienteEntity;
	}

	@PutMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteEntity update(@RequestBody ClienteEntity clienteEntity, @PathVariable String id) {
		ClienteEntity currentClienteEntity = this.clienteService.findById(id);
		currentClienteEntity.setNomClient(clienteEntity.getNomClient());
		currentClienteEntity.setApPaClient(clienteEntity.getApPaClient());
		currentClienteEntity.setApMaClient(clienteEntity.getApMaClient());
		currentClienteEntity.setEmailClient(clienteEntity.getEmailClient());
		currentClienteEntity.setTelClient(clienteEntity.getTelClient());
		this.clienteService.save(currentClienteEntity);
		return currentClienteEntity;
	}

	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		ClienteEntity currentClienteEntity = this.clienteService.findById(id);
		this.clienteService.delete(currentClienteEntity);
	}
	
}