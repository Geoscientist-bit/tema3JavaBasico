package com.tema5;

public class Coche implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Es el metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("Es el metodo findAll");
    }

    @Override
    public void delete() {
        System.out.println("Es el metodo delete");
    }
}
