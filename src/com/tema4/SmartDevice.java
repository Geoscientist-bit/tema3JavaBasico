package com.tema4;

public class SmartDevice {
    String color;
    String modelo;
    double tamaño;
    double grosor;
    String procesador;
    String marca;

    public SmartDevice(){

    }

    public SmartDevice(String color, String modelo, double tamaño, double grosor,
                       String procesador, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.grosor = grosor;
        this.procesador = procesador;
        this.marca = marca;
    }
}
