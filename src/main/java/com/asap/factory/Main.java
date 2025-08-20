package com.asap.factory;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

            String tipo = "none";

            Maquinaria maquinaria;

            if (tipo.equalsIgnoreCase("tractor")) {
                    maquinaria = new Tractor();
            } else if (tipo.equalsIgnoreCase("grua")) {
                    maquinaria = new Grua();
            } else if (tipo.equalsIgnoreCase("excavadora")) {
                    maquinaria = new Excavadora();
            }


            // creacion de objetos utilizando Factory Method
            Maquinaria tractor = new TractorFactory().crearMaquinaria();
            Maquinaria topadora = new TopadoraFactory().crearMaquinaria();
            Maquinaria grua = new GruaFactory().crearMaquinaria();
            Maquinaria excavadora = new ExcavadoraFactory().crearMaquinaria();
        // llamada a metodos
            tractor.alquilarMaquinaria();
            topadora.alquilarMaquinaria();
            grua.alquilarMaquinaria();
            excavadora.alquilarMaquinaria();

        // imprimiendo objeto creado y sus atributos
            System.out.println(grua);



        //SIN FACTORY METHOD

//        // el cliente crea directamente los objetos concretos
//        Tractor tractor = new Tractor("Tractor John Deere", 1500.0, LocalDate.now());
//        Grua grua = new Grua("Grúa Liebherr", 3000.0, LocalDate.now(), 23.1);
//        Excavadora excavadora = new Excavadora("Excavadora Hitachi", 4000.0, LocalDate.now();
//        Topadora topadora = new Topadora("Topadora CAT", 2000.0, LocalDate.now());
//        // llamada a metodos
//        tractor.alquilarMaquinaria();
//        grua.alquilarMaquinaria();
//        excavadora.alquilarMaquinaria();
//        topadora.alquilarMaquinaria();






    }
}
