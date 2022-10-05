package com.tema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new Coche();
        cocheCRUD.delete();
        cocheCRUD.save();
        cocheCRUD.findAll();


    }
}
