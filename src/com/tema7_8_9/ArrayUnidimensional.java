package com.tema7_8_9;

import static com.tema7_8_9.Vectores.vect;

public class ArrayUnidimensional {

    public static void arreglos() {




        //1. Array unidimensional

        String nombres[] = {"jhon", "andres", "mayerlin", "andrea"};
        for (String nombre: nombres) {
            System.out.println("nombre => " + nombre);
        }

        //2. array bidimensional
        int arrayBidi[][] = new int[3][4];

        arrayBidi[0][0] = 10;
        arrayBidi[0][1] = 20;
        arrayBidi[0][2] = 30;
        arrayBidi[0][3] = 40;

        arrayBidi[1][0] = 401;
        arrayBidi[1][1] = 402;
        arrayBidi[1][2] = 403;
        arrayBidi[1][3] = 404;

        arrayBidi[2][0] = 504;
        arrayBidi[2][1] = 505;
        arrayBidi[2][2] = 506;
        arrayBidi[2][3] = 507;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("valor de i" + i);
            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("estoy en " + i + ",j " + j);
                for (int k = 0; k < arrayBidi[2].length; k++) {
                    System.out.println("estoy en " + i + ",j " + j + ",k " + k);
                }
            }

        }










    }
}
