package Grupo3.recursos.humanos.services;

import java.util.ArrayList;
import java.util.Optional;

import Grupo3.recursos.humanos.models.cargoModel;
import Grupo3.recursos.humanos.repositories.cargoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class cargoService {

    @Autowired
    private cargoRepository cargor;

    public ArrayList<cargoModel> obtenerCargos(){
        return (ArrayList<cargoModel>) cargor.findAll();
    }

    public Optional<cargoModel> obtenerCargo(int id){
        return cargor.findById(id);
    }

    public cargoModel guardarCargo(cargoModel cargo){
        return cargor.save(cargo);
    }

    public Optional<cargoModel> cambiarEstadoCargo(int id){
        Optional<cargoModel> cargo = cargor.findById(id);
        if (cargo.isPresent()) {
            cargoModel cargoTemp = cargo.orElse(null);
            cargoTemp.setEstado_cargo(false);
            cargor.save(cargoTemp);
        } 
        return cargo;
    }
    
}
