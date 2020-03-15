package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Municipio;
import com.jjlglass.apptours.models.services.MunicipioService;

@RestController
@RequestMapping("/apptours/municipio")
public class MunicipioController {

    @Autowired
    private MunicipioService municipioService;

    @RequestMapping(value="/municipio", method = RequestMethod.GET)
    public List<Municipio>getList(){
        List<Municipio>nombreObjeto = municipioService.findAll();
        return nombreObjeto;
    }
    @RequestMapping(value="/municipio/{id}", method = RequestMethod.GET)
    public Municipio obtenerPorId(@PathVariable("id") Long id) {
    Optional<Municipio> nombreObjeto = municipioService.findById(id);
    return nombreObjeto.get();
    }
    @RequestMapping(value="/municipio", method = RequestMethod.POST)
    public Municipio guardar(@RequestBody Municipio municipio){
    Municipio cd = municipioService.save(municipio);
    return cd;
    }
    @RequestMapping(value="/municipio/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    municipioService.delete(id);
    }

}
