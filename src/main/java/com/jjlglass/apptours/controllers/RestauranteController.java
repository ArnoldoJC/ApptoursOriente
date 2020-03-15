package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Restaurante;
import com.jjlglass.apptours.models.services.RestauranteService;

@RestController
@RequestMapping("apptours/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @RequestMapping(value="/restaurante", method = RequestMethod.GET)
    public List<Restaurante>getList(){
        List<Restaurante>nombreObjeto = restauranteService.findAll();
        return nombreObjeto;
    }

    @RequestMapping(value="/restaurante/{id}", method = RequestMethod.GET)
    public Restaurante obtenerPorId(@PathVariable("id") Long id) {
    Optional<Restaurante> nombreObjeto = restauranteService.findById(id);
    return nombreObjeto.get();
    }

    @RequestMapping(value="/restaurante", method = RequestMethod.POST)
    public Restaurante guardar(@RequestBody Restaurante restaurante){
    Restaurante cd = restauranteService.save(restaurante);
    return cd;
    }

    @RequestMapping(value="/restaurante/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    restauranteService.delete(id);
    }


}