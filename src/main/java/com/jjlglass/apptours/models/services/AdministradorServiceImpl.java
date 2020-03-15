package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.AdministradorRepository;
import com.jjlglass.apptours.models.entities.Administrador;

@Service
public class AdministradorServiceImpl implements AdministradorService {

	
	@Autowired
	public AdministradorRepository repository;

	@Override
	public List<Administrador> findAll() {
		return (List<Administrador>) repository.findAll();
	}

	@Override
	public Administrador save(Administrador entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Administrador> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
		
	}
	
	
}
