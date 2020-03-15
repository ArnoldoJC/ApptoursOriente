package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Galeria;
import com.jjlglass.apptours.models.services.GaleriaService;

@RestController
@RequestMapping("/apptours/galeria")
public class GaleriaController {

    @Autowired
    private GaleriaService galeriaService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<Galeria>getList(){
        List<Galeria>nombreObjeto = galeriaService.findAll();
        return nombreObjeto;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Galeria obtenerPorId(@PathVariable("id") Long id) {
    Optional<Galeria> nombreObjeto = galeriaService.findById(id);
    return nombreObjeto.get();
    }
    @RequestMapping(value="", method = RequestMethod.POST)
    public Galeria guardar(@RequestBody Galeria galeria){
    Galeria cd = galeriaService.save(galeria);
    return cd;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    galeriaService.delete(id);
    }

}
