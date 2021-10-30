package Grupo3.recursos.humanos.services;

import java.util.ArrayList;
import java.util.Optional;

import Grupo3.recursos.humanos.models.postulanteModel;
import Grupo3.recursos.humanos.repositories.postulanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class postulanteService {

    @Autowired
    private postulanteRepository postulanter;

    public ArrayList<postulanteModel> obtenerpostulantes(){ 
        return (ArrayList<postulanteModel>) postulanter.findAll();
    }

    public Optional<postulanteModel> obtenerpostulante(int id){
        return postulanter.findById(id);
    }

    public postulanteModel guardarpostulante(postulanteModel postulante){
        return postulanter.save(postulante);
    }

    public Optional<postulanteModel> cambiarEstadoPostulante(int id){
        Optional<postulanteModel> postulante = postulanter.findById(id);
        if (postulante.isPresent()) {
            postulanteModel postulanteTemp = postulante.orElse(null);
            postulanteTemp.setEstado_postulante(false);
            postulanter.save(postulanteTemp);
        } 
        return postulante;
    }
    
}
