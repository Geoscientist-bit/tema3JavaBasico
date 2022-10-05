package com.poo.clases;

import com.poo.herencia.Camion;
import com.poo.herencia.Coche;
import com.poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        Motor motorGTI = new Motor("GTI", 180, 459d, 8);
        Vehiculo kiaSportage = new Vehiculo();
        Vehiculo fordMustang = new Vehiculo("ford", "mustang", 1.8d, 2021,true,
                120, motorGTI);
        System.out.println("KiaSportage = " + kiaSportage.speed);
        kiaSportage.speed = 100;
        System.out.println("kia" + kiaSportage.speed);
        System.out.println("fordMustang = " + fordMustang.speed);
        fordMustang.speed = 120;
        System.out.println("fordMustang = " + fordMustang.speed);

        Motocicleta kawasaki = new Motocicleta();
        kawasaki.fabricante = "Kawasaki";

        //polimorfismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(23);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(60);

        // clases abstractas: no se pueden instanciar, solo instancian las clases hijas



    }

}
