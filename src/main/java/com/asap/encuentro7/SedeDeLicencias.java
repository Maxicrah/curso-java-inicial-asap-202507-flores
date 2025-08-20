package com.asap.encuentro7;

import com.google.gson.Gson;

import java.util.*;

public class SedeDeLicencias {

    private List<Examen> examenes = new ArrayList<>();

    public void agregarExamen(Examen examen) {
        this.examenes.add(examen);
    }

    public String obtenerInforme() {
        Informe informe = new Informe(this.examenes);

        double porcentajeReprobados = informe.obtenerPorcentajeReprobados();
        double promedioTiempoAprobadosAuto = informe.obtenerPromedioTiempoExamenAprobadoAutos();

        Map<String, Double> resultado = new HashMap<>();
        resultado.put("promTiempoAutosAprobados", promedioTiempoAprobadosAuto);
        resultado.put("porcReprobados", porcentajeReprobados);

        Gson gson = new Gson();
        return gson.toJson(resultado);
    }



}
