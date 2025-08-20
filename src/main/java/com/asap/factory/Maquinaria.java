package com.asap.factory;

import java.time.LocalDate;

public abstract class Maquinaria {

    private String nombre;
    private double precio;
    private LocalDate fechaAlquiler;


    public Maquinaria(String nombre, double precio, LocalDate fechaAlquiler) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Maquinaria() {
    }

    public abstract void alquilarMaquinaria();

    @Override
    public String toString() {
        return "Maquinaria{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaAlquiler=" + fechaAlquiler +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
}
