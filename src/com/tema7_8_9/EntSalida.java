package com.tema7_8_9;

import java.io.*;

public class EntSalida {

    public static void archivos(String fileIn, String fileOut) throws FileNotFoundException {

        try {
            InputStream ficheroNuevo = new FileInputStream(fileIn);

            try{
                byte [] datosFile = ficheroNuevo.readAllBytes();
                ficheroNuevo.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datosFile);
                out.close();

            }catch (IOException e){
                System.out.println("No se puede leer el fichero " + e.getMessage());
            }


        }catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }



    }
}
