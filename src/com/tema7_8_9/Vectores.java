package com.tema7_8_9;

import java.util.Vector;

public class Vectores {

    public static void vect(){
        Vector <String> motosMarca = new Vector<>();

        motosMarca.add("Davinson");
        motosMarca.add("Honda");
        motosMarca.add("Zusuki");
        motosMarca.add("Ducati");
        motosMarca.add("Kawasaki");

        motosMarca.remove(1);
        motosMarca.remove(1);

        System.out.println("Datos del vector -->" + motosMarca);

        System.out.println("valor tamaño " + motosMarca.size() + " y capacidad " + motosMarca.capacity());


    }
}
