package Grupo3.recursos.humanos.controller;

import java.util.ArrayList;
import Grupo3.recursos.humanos.models.usuarioModel;
import Grupo3.recursos.humanos.services.usuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")

public class usuarioController {
    
    @Autowired
    private usuarioService uService;
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String borrarUsuario(@RequestBody usuarioModel usuario){
        //Obtengo todos los usuarios
        ArrayList<usuarioModel> users = uService.obtenerUsuarios();
        //Hago un forEach de arraylist que es **users**
        //En una variable temporal **userTemp** traigo la información de cada usermodel
        for (usuarioModel userTemp : users) {
            if (userTemp.getNick_usuario().equals(usuario.getNick_usuario())) {
                if (userTemp.getContra_usuario().equals(usuario.getContra_usuario())) {
                    return userTemp.getRol_usuario();
                }
            }
        }
        return "error";
    }  
}
