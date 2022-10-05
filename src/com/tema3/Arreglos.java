package com.tema3;

public class Arreglos {

    public static void main(String[] args) {

        String[] nombres = {"jhon", "pedro", "yenny", "laura"};
        String concatenado = "";
        for (int i = 0; i < nombres.length; i++){
            concatenado = concatenado + " " + nombres[i];
        }
        System.out.println("concatenado => " + concatenado);
    }
}
