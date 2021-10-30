package Grupo3.recursos.humanos.controller;
import java.util.ArrayList;
import java.util.Optional;

import Grupo3.recursos.humanos.models.postulanteModel;
import Grupo3.recursos.humanos.services.postulanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postulante")

public class postulanteController {

    @Autowired
    private postulanteService dService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<postulanteModel> obtenerpostulantes(){
        return this.dService.obtenerpostulantes();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public postulanteModel guardarUsuario(@RequestBody postulanteModel postulante){
        return this.dService.guardarpostulante(postulante);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<postulanteModel> obtenerPostulanteostulante(@PathVariable int id){
        return this.dService.obtenerpostulante(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Optional<postulanteModel> cambiarEstadoPostulante(@PathVariable int id){
        return this.dService.cambiarEstadoPostulante(id);
    } 


    
}
