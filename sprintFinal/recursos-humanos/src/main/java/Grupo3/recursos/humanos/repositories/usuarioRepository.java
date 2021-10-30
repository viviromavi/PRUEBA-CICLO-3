package Grupo3.recursos.humanos.repositories;
import Grupo3.recursos.humanos.models.usuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface usuarioRepository extends CrudRepository<usuarioModel,Long>{
    
}
