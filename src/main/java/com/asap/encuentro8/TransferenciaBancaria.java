package com.asap.encuentro8;

import com.github.sanchezih.util.Fecha;

import java.time.LocalDate;

public class TransferenciaBancaria extends MedioDePago{
    private String cbu;


    public TransferenciaBancaria(Fecha fechaPago, String cbu) {
        super(fechaPago);
        this.cbu = cbu;
    }

    @Override
    public double calcularPrecioFinal(double precioBase, Fecha fechaCompra) {
        double precioFinal = precioBase * 1.05;
        int dias = Fecha.diasTranscurridosEntreFechas(fechaCompra, fechaPago);
        if (dias > 10){
            precioFinal *= 1.05;
        }
        return precioFinal;
    }
}
