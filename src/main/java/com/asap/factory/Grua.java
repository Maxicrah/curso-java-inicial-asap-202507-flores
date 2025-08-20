package com.asap.factory;

import java.time.LocalDate;

public class Grua extends Maquinaria{

    private double capacidadCarga;


    public Grua(String nombre, double precio, LocalDate fechaAlquiler, double capacidadCarga) {
        super(nombre, precio, fechaAlquiler);
        this.capacidadCarga = capacidadCarga;
    }

    public Grua() {
    }

    @Override
    public void alquilarMaquinaria() {
        System.out.println("Alquilando grua...");
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Grua{" +
                "capacidadCarga: " + capacidadCarga + " " +
                "nombre: " + getNombre() + " " +
                "precio: " + getPrecio() + " " +
                "fechaAlquiler: " + getFechaAlquiler() + " " +
                '}';
    }
}
