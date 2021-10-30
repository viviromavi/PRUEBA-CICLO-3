package Grupo3.recursos.humanos.repositories;

import Grupo3.recursos.humanos.models.cargoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface cargoRepository extends CrudRepository<cargoModel,Integer>{
    
}
