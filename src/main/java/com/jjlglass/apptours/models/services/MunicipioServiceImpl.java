package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.MunicipioRepository;
import com.jjlglass.apptours.models.entities.Municipio;

@Service
public class MunicipioServiceImpl implements MunicipioService {

	
	@Autowired
	public MunicipioRepository repository;

	@Override
	public List<Municipio> findAll() {
		return (List<Municipio>) repository.findAll() ;
	}

	@Override
	public Municipio save(Municipio entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Municipio> findById(Long id) {
		
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}