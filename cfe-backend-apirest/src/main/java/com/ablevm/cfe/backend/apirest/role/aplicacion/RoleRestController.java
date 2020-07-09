package com.ablevm.cfe.backend.apirest.role.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ablevm.cfe.backend.apirest.role.dominio.RoleEntity;
import com.ablevm.cfe.backend.apirest.role.infraestructura.RoleService;

@RestController
@RequestMapping("/api")
public class RoleRestController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role")
	public List<RoleEntity>index(){
		return roleService.findAll();
	}

}
