package com.codewars.camelcase;

public class Solution {
    /*
    1. recorrer el string identinficando los guiones y el underscore
    2. Borra el guioon y el underscore
    3. pasar a mayuscula la primer letra que sigue despues del guión

     */
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    String palabra = "the-stealth-warrior";

    static String toCamelCase(String s){
        s = s.replace("-"," ").replace("_"," ");

        if (s.length() == 0){
            return s;
        }

        String palabra = "";
        String splitS[] = s.replace("-"," ").replace("_"," ")
                .split(" ");

        for (String res: splitS
             ) {
            char [] arr = res.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            String union = "";

            for (int i = 0; i < arr.length; i++) {
                 union = union + arr[i];

            }
            palabra += union;



        }

        return palabra;
    }
}
