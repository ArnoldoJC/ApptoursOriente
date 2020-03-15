package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Categoria;
import com.jjlglass.apptours.models.services.CategoriaService;

@RestController
@RequestMapping("/apptours/categoria")
public class CategoriaController {
	
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value="/categoria", method = RequestMethod.GET)
    public List<Categoria>getList(){
        List<Categoria>nombreObjeto = categoriaService.findAll();
        return nombreObjeto;
    }

    @RequestMapping(value="/categoria/{id}", method = RequestMethod.GET)
    public Categoria obtenerPorId(@PathVariable("id") Long id) {
    Optional<Categoria> nombreObjeto = categoriaService.findById(id);
    return nombreObjeto.get();
    }

    @RequestMapping(value="/categoria", method = RequestMethod.POST)
    public Categoria guardar(@RequestBody Categoria categoria){
    Categoria cd = categoriaService.save(categoria);
    return cd;
    }

    @RequestMapping(value="/categoria/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    categoriaService.delete(id);
    }

}
