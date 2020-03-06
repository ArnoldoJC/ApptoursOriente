package com.jjlglass.apptours.models.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.CategoriaRepository;
import com.jjlglass.apptours.models.entities.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	
	@Autowired
	public CategoriaRepository repository;

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria save(Categoria entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Categoria> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}