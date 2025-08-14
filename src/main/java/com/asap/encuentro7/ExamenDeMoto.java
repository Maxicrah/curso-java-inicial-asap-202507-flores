package com.asap.encuentro7;

import java.util.ArrayList;
import java.util.List;

public class ExamenDeMoto extends Examen{

   private List<Circuito> circuitos;
   private Moto moto;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto) {
        super(fecha, persona);
        this.circuitos = new ArrayList<>();
        this.moto = moto;
    }

    public List<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(List<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public ExamenDeMoto(String fecha, Persona persona) {
        super(fecha, persona);
    }

    public void agregarCircuito(Circuito circuito){
        this.circuitos.add(circuito);
    }

    @Override
    public boolean aprobado() {
        if (moto.getCilindrada() > 150){
            for (Circuito c : this.circuitos){
                if (!c.aprobado()){
                    return false;
                }
            }
            return true;
        }else{
            int desaprobados = 0;
            int tiempoTotal = 0;
            for (Circuito c : this.circuitos){
                if (!c.aprobado()){
                    desaprobados++;
                }
                tiempoTotal += c.getSegundos();
            }
            return desaprobados <= 1 && tiempoTotal <=120;
        }
    }







}
