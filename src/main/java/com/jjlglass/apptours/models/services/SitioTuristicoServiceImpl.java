package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.SitioTuristicoRepository;
import com.jjlglass.apptours.models.entities.SitioTuristico;

@Service
public class SitioTuristicoServiceImpl implements SitioTuristicoService {

	
	@Autowired
	public SitioTuristicoRepository repository;

	@Override
	public List<SitioTuristico> findAll() {
		return (List<SitioTuristico>) repository.findAll();
	}

	@Override
	public SitioTuristico save(SitioTuristico entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<SitioTuristico> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}