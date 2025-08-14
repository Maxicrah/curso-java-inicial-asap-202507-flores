package com.asap.encuentro7;

public class Circuito implements Evaluable{

    private int segundos;
    private int cantFaltas;



    public Circuito(int segundos, int cantFaltas) {
        this.segundos = segundos;
        this.cantFaltas = cantFaltas;
    }

    public Circuito() {
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getCantFaltas() {
        return cantFaltas;
    }

    public void setCantFaltas(int cantFaltas) {
        this.cantFaltas = cantFaltas;
    }


    @Override
    public boolean aprobado() {
        return this.cantFaltas <= 2;
    }


}
