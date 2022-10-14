package com.tema7_8_9;

import java.util.ArrayList;

public class ListaEnteros {

    public static void listaInt(){

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size() ; i++) {
            if (numeros.get(i) % 2 == 0){
                numeros.remove(numeros.get(i));

            }

        }

        System.out.println("Array final " + numeros);

    }

}
