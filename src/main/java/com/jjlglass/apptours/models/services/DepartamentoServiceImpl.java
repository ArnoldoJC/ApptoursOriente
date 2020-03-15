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
<<<<<<< HEAD
		return (List<Departamento>) repository.findAll();
=======
		return (List<Departamento>) repository.findAll(); 
		
>>>>>>> df359c8cc59ac6b0f217031f64393c9a2d8f480b
	}

	@Override
	public Departamento save(Departamento entity) {
<<<<<<< HEAD
		return repository.save(entity);
	}

	@Override
	public Optional<Departamento> findById(Long id) {
		return repository .findById(id);
=======
		return repository.save(entity); 
	} 

	@Override
	public Optional<Departamento> findById(Long id) {
		return repository.findById(id);
>>>>>>> df359c8cc59ac6b0f217031f64393c9a2d8f480b
	}

	@Override
	public void delete(Long id) {
<<<<<<< HEAD
		repository.deleteById(id);	
=======
		repository.deleteById(id);
>>>>>>> df359c8cc59ac6b0f217031f64393c9a2d8f480b
		
	}
	
	
}
