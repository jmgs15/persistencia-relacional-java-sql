package com.urjc.plains.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Mecanico extends Empleado {

    private String empresa;

    private int anoIncorporacion;

    private String formacion;

    @OneToMany(mappedBy = "mecanico", cascade = CascadeType.ALL)
    private List<Revision> revisiones;

    public Mecanico() {}

    public Mecanico(String nombre, String apellidos, String empresa, int anoIncorporacion, String formacion) {
        super(nombre, apellidos);
        this.empresa = empresa;
        this.anoIncorporacion = anoIncorporacion;
        this.formacion = formacion;
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    @Override
    public String toString() {
        String padre = super.toString();
        return padre + " | Mecanico[ empresa: " + empresa +
        " | anoIncorporacion: " + anoIncorporacion +
        " | formacion: " + formacion + " ]";
    }
}
