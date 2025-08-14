package com.asap.encuentro7;

public class Moto extends Vehiculo{
    private boolean tieneEspejos;

    public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
        super(patente, marca, cilindrada);
        this.tieneEspejos = tieneEspejos;
    }

    public Moto(boolean tieneEspejos) {
        this.tieneEspejos = tieneEspejos;
    }

    public boolean isTieneEspejos() {
        return tieneEspejos;
    }

    public void setTieneEspejos(boolean tieneEspejos) {
        this.tieneEspejos = tieneEspejos;
    }
}
