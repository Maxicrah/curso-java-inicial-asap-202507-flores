package com.asap.encuentro7;

public abstract class Examen implements Evaluable{
    private String fecha;
    private Persona persona;

    public Examen(String fecha, Persona persona){
        this.fecha = fecha;
        this.persona = persona;
    }


}
