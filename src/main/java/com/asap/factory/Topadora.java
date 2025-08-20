package com.asap.factory;

import java.time.LocalDate;

public class Topadora extends Maquinaria{


    public Topadora() {
    }

    public Topadora(String nombre, double precio, LocalDate fechaAlquiler) {
        super(nombre, precio, fechaAlquiler);
    }

    @Override
    public void alquilarMaquinaria() {
        System.out.println("Alquilando topadora...");
    }
}
