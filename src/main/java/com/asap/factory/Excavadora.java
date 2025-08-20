package com.asap.factory;

import java.time.LocalDate;

public class Excavadora extends Maquinaria{


    public Excavadora(String nombre, double precio, LocalDate fechaAlquiler) {
        super(nombre, precio, fechaAlquiler);
    }

    public Excavadora() {
    }

    @Override
    public void alquilarMaquinaria() {
        System.out.println("Alquilando excavadora...");
    }
}
