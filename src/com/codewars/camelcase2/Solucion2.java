package com.codewars.camelcase2;

public class Solucion2 {

    public static void main(String[] args) {
        String palabra1 = "the-stealth-warrior";
        String palabra2 = "the_stealth_warrior";

        System.out.println(toCamelCase(palabra1));
    }
    static String toCamelCase(String s){
        String replace = s.replace("-"," ").replace("_"," ");
        String [] replaceSplit = replace.split(" ");
        String resultado = "";
        String resultado2 = "";

        /*
        for (String letras: replaceSplit) {

            resultado += letras.toUpperCase().charAt(0) +
                    letras.substring(1).toLowerCase();


        }
         */


        String temporal = replaceSplit[0];
        for (int i = 1; i < replaceSplit.length; i++) {
            resultado2 += replaceSplit[i].toUpperCase().charAt(0) +
                    replaceSplit[i].substring(1).toLowerCase();

        }



        return temporal + resultado2;
    }
}
