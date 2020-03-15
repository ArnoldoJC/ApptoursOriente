package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.DepartamentoRepository;
import com.jjlglass.apptours.models.entities.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	
	@Autowired
	public DepartamentoRepository repository;

	@Override
	public List<Departamento> findAll() {
		return (List<Departamento>) repository.findAll(); 
		
	}

	@Override
	public Departamento save(Departamento entity) {
		return repository.save(entity); 
	} 

	@Override
	public Optional<Departamento> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}
