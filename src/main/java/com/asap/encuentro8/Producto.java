package com.asap.encuentro8;

public class Producto {


    private String id;
    private double precio;

    public Producto(String id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
