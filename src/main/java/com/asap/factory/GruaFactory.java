package com.asap.factory;

import java.time.LocalDate;

public class GruaFactory implements MaquinariaFactory  {

    //creando objeto grua
    @Override
    public Maquinaria crearMaquinaria() {
        return new Grua("Bulldozer", 23.2, LocalDate.now(), 23.12);
    }
}
