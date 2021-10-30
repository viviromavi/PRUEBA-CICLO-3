package Grupo3.recursos.humanos.models;

import javax.persistence.*;

@Entity
@Table(name = "postulante")

public class postulanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_postulante;

    private String nombre_postulante;
    private String segnombre_postulante;
    private String apellido_postulante;
    private String segapellido_postulante;
    private String anios_experiencia_postulante;
    private String titulo_principal_postulante;
    private int titulo_secundario_postulante;
    private String telefono_postulante;
    private boolean estado_postulante = true;


    @ManyToOne
    @JoinColumn(name ="id_cargo")
    private cargoModel id_cargo_cargo;


    public int getId_postulante() {
        return this.id_postulante;
    }

    public void setId_postulante(int id_postulante) {
        this.id_postulante = id_postulante;
    }

    public String getNombre_postulante() {
        return this.nombre_postulante;
    }

    public void setNombre_postulante(String nombre_postulante) {
        this.nombre_postulante = nombre_postulante;
    }

    public String getSegnombre_postulante() {
        return this.segnombre_postulante;
    }

    public void setSegnombre_postulante(String segnombre_postulante) {
        this.segnombre_postulante = segnombre_postulante;
    }

    public String getApellido_postulante() {
        return this.apellido_postulante;
    }

    public void setApellido_postulante(String apellido_postulante) {
        this.apellido_postulante = apellido_postulante;
    }

    public String getSegapellido_postulante() {
        return this.segapellido_postulante;
    }

    public void setSegapellido_postulante(String segapellido_postulante) {
        this.segapellido_postulante = segapellido_postulante;
    }

    public String getAnios_experiencia_postulante() {
        return this.anios_experiencia_postulante;
    }

    public void setAnios_experiencia_postulante(String anios_experiencia_postulante) {
        this.anios_experiencia_postulante = anios_experiencia_postulante;
    }

    public String getTitulo_principal_postulante() {
        return this.titulo_principal_postulante;
    }

    public void setTitulo_principal_postulante(String titulo_principal_postulante) {
        this.titulo_principal_postulante = titulo_principal_postulante;
    }

    public int getTitulo_secundario_postulante() {
        return this.titulo_secundario_postulante;
    }

    public void setTitulo_secundario_postulante(int titulo_secundario_postulante) {
        this.titulo_secundario_postulante = titulo_secundario_postulante;
    }

    public String getTelefono_postulante() {
        return this.telefono_postulante;
    }

    public void setTelefono_postulante(String telefono_postulante) {
        this.telefono_postulante = telefono_postulante;
    }


    public cargoModel getId_cargo_cargo() {
        return this.id_cargo_cargo;
    }

    public void setId_cargo_cargo(cargoModel id_cargo_cargo) {
        this.id_cargo_cargo = id_cargo_cargo;
    }

    public boolean isEstado_postulante() {
        return this.estado_postulante;
    }

    public boolean getEstado_postulante() {
        return this.estado_postulante;
    }

    public void setEstado_postulante(boolean estado_postulante) {
        this.estado_postulante = estado_postulante;
    }
    
}
