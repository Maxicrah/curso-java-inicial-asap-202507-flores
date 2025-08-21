package com.asap.encuentro8;

import com.github.sanchezih.util.Fecha;

public abstract class MedioDePago {

    protected Fecha fechaPago;

    public MedioDePago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Fecha getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Fecha fechaPago) {
        this.fechaPago = fechaPago;
    }

    public abstract double calcularPrecioFinal(double precioBase, Fecha fechaCompra);
}
