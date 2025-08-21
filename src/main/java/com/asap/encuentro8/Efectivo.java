package com.asap.encuentro8;

import com.github.sanchezih.util.Fecha;

public class Efectivo extends MedioDePago{

    private boolean esConsumidorFinal;

    public Efectivo(Fecha fechaPago, boolean esConsumidorFinal) {
        super(fechaPago);
        this.esConsumidorFinal = esConsumidorFinal;
    }




    @Override
    public double calcularPrecioFinal(double precioBase, Fecha fechaCompra) {
        if (esConsumidorFinal){
            return precioBase * 0.85;
        }else{
            return precioBase * 0.90;
        }
    }
}
