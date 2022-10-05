package com.poo.herencia;

import com.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;
    public Motocicleta(){

    }

    public Motocicleta(boolean baul) {
        this.baul = baul;
    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, boolean baul) {
        super(fabricante, modelo, cc, year, sport);
        this.baul = baul;
    }
}
