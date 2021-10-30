package Grupo3.recursos.humanos.repositories;

import Grupo3.recursos.humanos.models.postulanteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface postulanteRepository extends CrudRepository<postulanteModel,Integer>{
    
}
