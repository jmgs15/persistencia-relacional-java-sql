package com.urjc.plains.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Avion {

    @Id
    private String matricula;

    private String fabricante;

    private String modelo;

    private int horasVuelo;

    @OneToMany(mappedBy = "avionRevisado")
    List<Revision> revisiones;

    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos;

    public Avion() {}

    public Avion(String matricula, String fabricante, String modelo, int horasVuelo) {
        this.matricula = matricula;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
    }

    public String getId() {
        return matricula;
    }

    public void setId(String matricula) {
        this.matricula = matricula;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
