package com.tema7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {
    public static void arrayList(){
        ArrayList<String> lista = new ArrayList<>();


        lista.add("perro");
        lista.add("Gatos");
        lista.add("Jirafa");
        lista.add("Simio");

        //lista enlazada

        LinkedList<String> listaEnlazada = new LinkedList<>(lista);

        for (String listAnimales: listaEnlazada) {
            System.out.println("listAnimales --> " + listAnimales);
        }


        String array[] = new String[lista.size()];

        for (int i = 0; i < lista.size() ; i++) {
            array[i] = lista.get(i);

        }
        for (String animales: array) {
            System.out.println("El elemento es " + animales);
        }

    }
}
