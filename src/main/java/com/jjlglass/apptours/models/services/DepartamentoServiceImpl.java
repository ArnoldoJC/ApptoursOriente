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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento save(Departamento entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Departamento> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
