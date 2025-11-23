package com.example.glypha_primer_parcial_giardina_saracco.data.model;

public class Fuente {
    private int id;
    private String nombre;
    private String peso;
    private String tamanio;

    //TODO: Agregar categoria

    public Fuente(String nombre) {
        this.nombre = nombre;
    }

    public Fuente(int id, String nombre, String peso, String tamanio) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tamanio = tamanio;
    }

    public Fuente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
