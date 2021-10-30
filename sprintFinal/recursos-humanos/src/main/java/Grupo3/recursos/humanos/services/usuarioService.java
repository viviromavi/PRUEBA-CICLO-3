package Grupo3.recursos.humanos.services;

import java.util.ArrayList;
import java.util.Optional;

import Grupo3.recursos.humanos.models.usuarioModel;
import Grupo3.recursos.humanos.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class usuarioService {

    @Autowired
    private usuarioRepository usuarior;

    public ArrayList<usuarioModel> obtenerUsuarios(){
        return (ArrayList<usuarioModel>) usuarior.findAll();
    }

    public Optional<usuarioModel> obtenerUsuario(Long id){
        return usuarior.findById(id);
    }

    public usuarioModel guardarUsuario(usuarioModel usuario){
        return usuarior.save(usuario);
    }

    public void borrarUsuario(long id){
        usuarior.deleteById(id);
    }
    
}
