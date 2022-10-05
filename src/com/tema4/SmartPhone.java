package com.tema4;

public class SmartPhone extends SmartDevice {
    String sistemaOperativo;

    public SmartPhone(){

    }

    public SmartPhone(String color, String modelo, double tamaño, double grosor, String procesador,
                      String marca, String sistemaOperativo) {
        super(color, modelo, tamaño, grosor, procesador, marca);
        this.sistemaOperativo = sistemaOperativo;
    }
}
