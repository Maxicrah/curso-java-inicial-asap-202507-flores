package com.asap.encuentro8;

import com.github.sanchezih.util.Fecha;

public class TarjetaDeCredito extends MedioDePago{
    private int cuotas;

    public TarjetaDeCredito(Fecha fecha, int cuotas) {
        super(fecha);
        this.cuotas = cuotas;
    }

    public int getCuotas() {
        return cuotas;
    }



    @Override
    public double calcularPrecioFinal(double precioBase, Fecha fechaCompra) {
        return precioBase * (1 + 0.15 * cuotas);
    }
}
