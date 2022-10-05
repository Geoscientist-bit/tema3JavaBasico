package com.tema4;

public class Main {
    public static void main(String[] args) {
        SmartPhone motorola = new SmartPhone("negro", "G9 power", 17d, 2d,
                "snapdragon", "motorola", "android");
        System.out.println("SmartPhone = " + motorola.color);
        System.out.println("SmartPhone = " + motorola.modelo);
        System.out.println("SmartPhone = " + motorola.sistemaOperativo);

        SmartWatch reloj = new SmartWatch("white", "Iphone13", 7d, 0.2,
                null, "apple","IOS" );
        System.out.println("SmartWatch =" + reloj.marca);
        System.out.println("SmartWatch =" + reloj.compatibilidad);
        System.out.println("SmartWatch =" + reloj.modelo);
    }
}
