package com.asap.encuentro8;

import java.util.ArrayList;
import java.util.List;

public class SitioWeb {


    private List<CarritoDeCompra> carritos;

    public SitioWeb() {
        this.carritos = new ArrayList<>();
    }

    public void agregarCarritoVendido(CarritoDeCompra carrito){
        this.carritos.add(carrito);
    }

    public String idDelCarritoMasCaro(){

        CarritoDeCompra carritoMasCaro = this.carritos.getFirst();
        for (CarritoDeCompra carrito : this.carritos) {
            if (carrito.getTotal() > carritoMasCaro.getTotal()) {
                carritoMasCaro = carrito;
            }
        }
        return carritoMasCaro.getId();
    }

    public double nroCuotasPromedio(){
        int totalCuotas = 0;
        int cantidadCarritosConTarjeta = 0;

        for (CarritoDeCompra carrito : carritos) {
            MedioDePago mp = carrito.getMedioDePago();

            if (mp instanceof TarjetaDeCredito) {
                TarjetaDeCredito tc = (TarjetaDeCredito) mp;
                totalCuotas += tc.getCuotas();
                cantidadCarritosConTarjeta++;
            }
        }

        if (cantidadCarritosConTarjeta == 0) {
            return 0;
        }

        return (double) totalCuotas / cantidadCarritosConTarjeta;


    }

    public void mostrarPreciosDeCarritosVendidos() {
        for (CarritoDeCompra carrito : carritos) {
            double precioFinal = carrito.getTotal();
            System.out.println("Carrito " + carrito.getId() + " : $" + precioFinal);
        }
    }



}
