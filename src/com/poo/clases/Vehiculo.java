package com.poo.clases;

public class Vehiculo {

    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    public Vehiculo(){

    }
    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;

    }
    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;

    }
    public void acelerar (int quantity){
        this.speed = quantity;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed,
                    Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }
}


