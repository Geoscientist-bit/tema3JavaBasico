package com.tema7_8_9;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //1 y 2. Array unidimensional y bidimensional

        ArrayUnidimensional.arreglos();

        //3. Vectores

        Vectores.vect();

         /*
        4. Cuando se utiliza un vector y se execede su capacidad por debajo se crea un nuevo array y
        se copian los elementos que tengo y se crea uno nuevo donde se ingresan los elementos. Por
        esta razón cuando se excede la capacidad en 1000 el costo computacional será muy alto ya que
        crearan 10 copias aproximadante
         */

        //5. listas

        Listas.arrayList();

        ListaEnteros.listaInt();


        try {
            Execpcion.dividePorCero(4 , 0);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }

        try{
            InputFichero.input();
        }catch (FileNotFoundException e){
            System.out.println(" No se encuentra el fichero ---- " + e.getMessage());
        }




        try{
            String ruta = "/openBootcamp/Probando/HolaMundo.txt";
            String ruta2 = "destino.txt";
            EntSalida.archivos(ruta, ruta2);

        }catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero Nuevo " + e.getMessage());
        }


    }
}

