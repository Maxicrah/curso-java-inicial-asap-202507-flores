package com.asap.encuentro7;

import java.util.List;

public class Informe {

    private List<Examen> examenes;

    public Informe(List<Examen> examenes) {
        this.examenes = examenes;
    }

    public Informe() {
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }


    public int getCantidadReprobados(){

        int cantReprobados = 0;
        for (Examen ex : this.examenes){
            if (!ex.aprobado()){
                cantReprobados++;
            }
        }
        return cantReprobados;
    }


    public double obtenerPorcentajeReprobados() {
        if (this.examenes == null || this.examenes.isEmpty()) {
            return 0;
        }

        int total = this.examenes.size();
        double reprobados = getCantidadReprobados();

        return (reprobados * 100) / total;
    }

    public int obtenerExamenesAutosAprobados(){

        int cantExamenAprobados = 0;
        for (Examen ex : this.examenes){
            if (ex instanceof ExamenDeAuto){
                if (ex.aprobado()){
                    cantExamenAprobados++;
                }
            }
        }
        return cantExamenAprobados;
    }


    public double obtenerPromedioTiempoExamenAprobadoAutos() {
        double sumaTiempos = 0;
        int cantidad = 0;

        for (Examen examen : examenes) {
            if (examen instanceof ExamenDeAuto auto && auto.aprobado()) {

                    sumaTiempos += auto.getCircuito().getSegundos();
                    cantidad++;

            }
        }

        return cantidad > 0 ? sumaTiempos / cantidad : 0;
    }





}
