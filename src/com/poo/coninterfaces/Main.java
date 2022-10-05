package com.poo.coninterfaces;

import com.poo.sininterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

    public static void main(String[] args) {

            empleadoCRUD.findAll();
            empleadoCRUD.guardar(new Empleado());

    }
}
