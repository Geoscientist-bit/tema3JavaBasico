package com.tema7_8_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputFichero {
    public static void input() throws FileNotFoundException {
        try{
            InputStream fichero = new FileInputStream("/openBootcamp/Probando/HolaMundo.txt");

            try{
                byte []datos = fichero.readAllBytes();

                for (byte dato: datos) {
                    System.out.print((char) dato);
                }
            }catch (IOException e){
                System.out.println("No puedo leer el fichero " + e.getMessage() );
            }



        }catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }


    }
}
