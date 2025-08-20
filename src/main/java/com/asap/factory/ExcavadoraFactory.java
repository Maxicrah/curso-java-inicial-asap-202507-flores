package com.asap.factory;

public class ExcavadoraFactory implements MaquinariaFactory {
    @Override
    public Maquinaria crearMaquinaria() {
        return new Excavadora();
    }
}
