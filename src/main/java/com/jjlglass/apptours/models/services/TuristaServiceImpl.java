package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.TuristaRepository;
import com.jjlglass.apptours.models.entities.Turista;

@Service
public class TuristaServiceImpl implements TuristaService {

	
	@Autowired
	public TuristaRepository repository;

	@Override
	public List<Turista> findAll() {
		return (List<Turista>) repository.findAll();
	}

	@Override
	public Turista save(Turista entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Turista> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}


