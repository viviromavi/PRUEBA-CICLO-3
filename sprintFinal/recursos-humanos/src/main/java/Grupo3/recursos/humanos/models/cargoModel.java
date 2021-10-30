package Grupo3.recursos.humanos.models;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "cargo")
public class cargoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_cargo;
    private String nombre_cargo;
    private String titulo_principal_cargo;
    private String titulo_secundario_cargo;
    private String anios_experiencia_cargo;
   
    private boolean estado_cargo = true;

    
    @OneToMany(mappedBy = "id_postulante",cascade = CascadeType.ALL)
    private Set<postulanteModel> postulantes;


    public int getId_cargo() {
        return this.id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre_cargo() {
        return this.nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public String getTitulo_principal_cargo() {
        return this.titulo_principal_cargo;
    }

    public void setTitulo_principal_cargo(String titulo_principal_cargo) {
        this.titulo_principal_cargo = titulo_principal_cargo;
    }

    public String getTitulo_secundario_cargo() {
        return this.titulo_secundario_cargo;
    }

    public void setTitulo_secundario_cargo(String titulo_secundario_cargo) {
        this.titulo_secundario_cargo = titulo_secundario_cargo;
    }

    public String getAnios_experiencia_cargo() {
        return this.anios_experiencia_cargo;
    }

    public void setAnios_experiencia_cargo(String anios_experiencia_cargo) {
        this.anios_experiencia_cargo = anios_experiencia_cargo;
    }

  

    public boolean isEstado_cargo() {
        return this.estado_cargo;
    }

    public boolean getEstado_cargo() {
        return this.estado_cargo;
    }

    public void setEstado_cargo(boolean estado_cargo) {
        this.estado_cargo = estado_cargo;
    }

    public Set<postulanteModel> getpostulantes() {
        return this.postulantes;
    }

    public void setpostulantes(Set<postulanteModel> postulantes) {
        this.postulantes = postulantes;
    }
    

    
}
