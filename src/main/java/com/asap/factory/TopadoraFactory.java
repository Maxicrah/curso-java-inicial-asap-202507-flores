package com.asap.factory;

public class TopadoraFactory implements MaquinariaFactory {
    @Override
    public Maquinaria crearMaquinaria() {
        return new Topadora();
    }
}
