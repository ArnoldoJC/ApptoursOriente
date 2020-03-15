package com.jjlglass.apptours.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jjlglass.apptours.models.entities.Notificacion;
import com.jjlglass.apptours.models.services.NotificacionService;

@RestController
@RequestMapping("/apptours/notificacion")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<Notificacion>getList(){
        List<Notificacion>nombreObjeto = notificacionService.findAll();
        return nombreObjeto;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Notificacion obtenerPorId(@PathVariable("id") Long id) {
    Optional<Notificacion> nombreObjeto = notificacionService.findById(id);
    return nombreObjeto.get();
    }
    @RequestMapping(value="", method = RequestMethod.POST)
    public Notificacion guardar(@RequestBody Notificacion notificacion){
    Notificacion cd = notificacionService.save(notificacion);
    return cd;
    }
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Long id){
    notificacionService.delete(id);
    }

}
