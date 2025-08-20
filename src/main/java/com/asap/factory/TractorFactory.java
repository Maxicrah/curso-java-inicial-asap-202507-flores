package com.asap.factory;

public class TractorFactory implements MaquinariaFactory {
    @Override
    public Maquinaria crearMaquinaria() {
        return new Tractor();
    }
}
