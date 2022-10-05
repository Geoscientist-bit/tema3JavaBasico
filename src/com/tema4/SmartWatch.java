package com.tema4;

public class SmartWatch extends SmartDevice{
    String compatibilidad;

    public SmartWatch(){

    }

    public SmartWatch(String color, String modelo, double tamaño, double grosor, String procesador,
                      String marca, String compatibilidad) {
        super(color, modelo, tamaño, grosor, procesador, marca);
        this.compatibilidad = compatibilidad;
    }
}
