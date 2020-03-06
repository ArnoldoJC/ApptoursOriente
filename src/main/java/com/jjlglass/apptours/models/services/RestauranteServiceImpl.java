package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.RestauranteRepository;
import com.jjlglass.apptours.models.entities.Restaurante;

@Service
public class RestauranteServiceImpl implements RestauranteService {

	
	@Autowired
	public RestauranteRepository repository;

	@Override
	public List<Restaurante> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante save(Restaurante entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Restaurante> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}


