package com.tema7_8_9;

import java.util.Scanner;

public class Execpcion {
    public static int dividePorCero(int A, int B) throws ArithmeticException {
        int resultado = 0;

        try{
            resultado = A / B;

        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;



        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los números" );

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try{
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Boom!, excepción es: " + e.getClass());

        }catch (Exception e){
            System.out.println(" No es una excepción aritmetica");

        }finally {
            System.out.println("FINALLY");
        }

         */


    }
}
