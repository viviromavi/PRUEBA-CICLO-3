package Grupo3.recursos.humanos.controller;


import java.util.ArrayList;
import java.util.Optional;

import Grupo3.recursos.humanos.models.cargoModel;
import Grupo3.recursos.humanos.services.cargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//localhost:8080/cargo/
@RequestMapping("/cargo")

public class cargoController {
    
    @Autowired
    private cargoService dService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<cargoModel> obtenerCargos(){
        return this.dService.obtenerCargos();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public cargoModel guardarUsuario(@RequestBody cargoModel cargo){
        return this.dService.guardarCargo(cargo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<cargoModel> obtenerCargo(@PathVariable int id){
        return this.dService.obtenerCargo(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Optional<cargoModel> cambiarEstadoCargo(@PathVariable int id){
        return this.dService.cambiarEstadoCargo(id);
    }
}
