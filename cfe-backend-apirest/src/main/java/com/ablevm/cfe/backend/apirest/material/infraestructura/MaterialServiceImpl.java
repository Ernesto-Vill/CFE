package com.ablevm.cfe.backend.apirest.material.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ablevm.cfe.backend.apirest.material.dominio.Material;


@Service
public class MaterialServiceImpl implements MaterialService{

	@Autowired
	private MaterialDao materialDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Material> findAll() {
		return (List<Material>) materialDao.findAll();
	}
	@Override
	@Transactional
	public void save(Material material) {
		materialDao.save(material);
	}

	@Override
	@Transactional(readOnly = true)
	public Material findById(int id) {
		return materialDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Material material) {
		materialDao.delete(material);
		
	}
}
