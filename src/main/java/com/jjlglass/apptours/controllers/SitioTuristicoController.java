package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.SitioTuristico;
import com.jjlglass.apptours.models.services.SitioTuristicoService;

@RestController
@RequestMapping("/apptours/sitioTuristico")
public class SitioTuristicoController {


    @Autowired
    private SitioTuristicoService sitioTuristicoService;

    @RequestMapping(value="/sitioTuristico", method = RequestMethod.GET)
    public List<SitioTuristico>getList(){
        List<SitioTuristico>nombreObjeto = sitioTuristicoService.findAll();
        return nombreObjeto;
    }

    @RequestMapping(value="/sitioTuristico/{id}", method = RequestMethod.GET)
    public SitioTuristico obtenerPorId(@PathVariable("id") Long id) {
    Optional<SitioTuristico> nombreObjeto = sitioTuristicoService.findById(id);
    return nombreObjeto.get();
    }

    @RequestMapping(value="/sitioTuristico", method = RequestMethod.POST)
    public SitioTuristico guardar(@RequestBody SitioTuristico sitioTuristico){
    SitioTuristico cd = sitioTuristicoService.save(sitioTuristico);
    return cd;
    }

    @RequestMapping(value="/sitioTuristico/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    sitioTuristicoService.delete(id);
    }

}
