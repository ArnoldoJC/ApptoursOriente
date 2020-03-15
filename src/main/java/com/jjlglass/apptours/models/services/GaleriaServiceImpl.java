package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.GaleriaRepository;
import com.jjlglass.apptours.models.entities.Galeria;

@Service
public class GaleriaServiceImpl implements GaleriaService {

	
	@Autowired
	public GaleriaRepository repository;

	@Override
	public List<Galeria> findAll() {
		return (List<Galeria>) repository.findAll();
	}

	@Override
	public Galeria save(Galeria entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Galeria> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
		
	}
}	
	