package com.jjlglass.apptours.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Turista;
import com.jjlglass.apptours.models.services.TuristaService;

@RestController
@RequestMapping("apptours/turista")
public class TuristaController {


    @Autowired
    private TuristaService turistaService;

    @RequestMapping(value="/turista", method = RequestMethod.GET)
    public List<Turista>getList(){
        List<Turista>nombreObjeto = turistaService.findAll();
        return nombreObjeto;
    }

    @RequestMapping(value="/turista/{id}", method = RequestMethod.GET)
    public Turista obtenerPorId(@PathVariable("id") Long id) {
    Optional<Turista> nombreObjeto = turistaService.findById(id);
    return nombreObjeto.get();
    }

    @RequestMapping(value="/turista", method = RequestMethod.POST)
    public Turista guardar(@RequestBody Turista turista){
    Turista cd = turistaService.save(turista);
    return cd;
    }

    @RequestMapping(value="/turista/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    turistaService.delete(id);
    }
}
