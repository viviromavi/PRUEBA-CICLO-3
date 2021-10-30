package Grupo3.recursos.humanos.models;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class usuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id_usuario;

    private String nick_usuario;
    private String contra_usuario;
    private String rol_usuario;

    public boolean isEstado_usuario() {
        return this.estado_usuario;
    }

    public boolean getEstado_usuario() {
        return this.estado_usuario;
    }

    public void setEstado_usuario(boolean estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    private boolean estado_usuario = true;
    //private int estado_usuario=;

    public long getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNick_usuario() {
        return this.nick_usuario;
    }

    public void setNick_usuario(String nick_usuario) {
        this.nick_usuario = nick_usuario;
    }

    public String getContra_usuario() {
        return this.contra_usuario;
    }

    public void setContra_usuario(String contra_usuario) {
        this.contra_usuario = contra_usuario;
    }

    public String getRol_usuario() {
        return this.rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }
}
