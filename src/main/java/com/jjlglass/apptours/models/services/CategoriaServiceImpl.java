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
		return (List<Categoria>) repository.findAll();
	}

	@Override
	public Categoria save(Categoria entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Categoria> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
		
	}
	
	
}