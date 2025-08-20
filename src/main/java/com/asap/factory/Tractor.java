package com.asap.factory;

import java.time.LocalDate;

public class Tractor extends Maquinaria{


    public Tractor(String nombre, double precio, LocalDate fechaAlquiler) {
        super(nombre, precio, fechaAlquiler);
    }

    public Tractor() {
    }

    @Override
    public void alquilarMaquinaria() {
        System.out.println("Alquilando tractor...");
    }
}
