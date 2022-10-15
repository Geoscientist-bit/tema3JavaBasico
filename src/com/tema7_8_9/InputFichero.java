package com.tema7_8_9;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFichero {
    public static void input() throws FileNotFoundException {
        try{
            Scanner scanner = new Scanner(System.in);

            //la tecnica del flag
            boolean ok = false;

            do {
                System.out.println("Ingresa dos numeros enteros: ");

                try {

                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Enteros son " + a +" "+ b);
                    ok = true;

                }catch (InputMismatchException e){
                    System.out.println("Numeros invalidos ");

                }

            }while(!ok);

            //PrintStream

            PrintStream info = new PrintStream("copia.txt");
            info.println("nuevo texto");



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
