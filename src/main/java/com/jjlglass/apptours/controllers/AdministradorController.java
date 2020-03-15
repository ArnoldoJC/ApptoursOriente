package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Administrador;
import com.jjlglass.apptours.models.services.AdministradorService;

@RestController
@RequestMapping("/apptours/administrador")
public class AdministradorController {
	
	@Autowired
	private AdministradorService administradorService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<Administrador>getList(){
		List<Administrador>nombreObjeto = administradorService.findAll();
		return nombreObjeto;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Administrador obtenerPorId(@PathVariable("id") Long id) {
	Optional<Administrador> nombreObjeto = administradorService.findById(id);
	return nombreObjeto.get();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public Administrador guardar(@RequestBody Administrador administrador){
	Administrador cd = administradorService.save(administrador);
	return cd;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	administradorService.delete(id);
	}
	
	
}
