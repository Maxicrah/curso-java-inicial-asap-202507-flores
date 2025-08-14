package com.asap.encuentro7;

public class ExamenDeAuto extends Examen{

    private Circuito circuito;
    private Auto auto;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
        super(fecha, persona);
        this.circuito = circuito;
        this.auto = auto;
    }


    public ExamenDeAuto(String fecha, Persona persona) {
        super(fecha, persona);
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    @Override
    public boolean aprobado() {
        return this.circuito.getSegundos() <= 90;
    }
}
