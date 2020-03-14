package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Departamento;
import com.jjlglass.apptours.models.services.DepartamentoService;

@RestController
@RequestMapping("apptours/departamento")
public class DepartamentoController {

	 @Autowired
	    private DepartamentoService departamentoService;

	    @RequestMapping(value="departamento", method = RequestMethod.GET)
	    public List<Departamento>getList(){
	        List<Departamento>nombreObjeto = departamentoService.findAll();
	        return nombreObjeto;
	    }

	    @RequestMapping(value="/departamento/{id}", method = RequestMethod.GET)
	    public Departamento obtenerPorId(@PathVariable("id") Long id) {
	    Optional<Departamento> nombreObjeto = departamentoService.findById(id);
	    return nombreObjeto.get();
	    }

	    @RequestMapping(value="/departamento", method = RequestMethod.POST)
	    public Departamento guardar(@RequestBody Departamento departamento){
	    Departamento cd = departamentoService.save(departamento);
	    return cd;
	    }

	    @RequestMapping(value="/departamento/{id}", method = RequestMethod.DELETE)
	    public void deleteById(@PathVariable("id") Long id){
	    departamentoService.delete(id);
	    }
}
