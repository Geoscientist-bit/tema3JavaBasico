package com.poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado jhon = new Empleado("jhon", 35, 10000, true);
        Empleado roberto = new Empleado("roberto", 41, 12000, true);
        Empleado juanita = new Empleado("juanita", 22, 9000, true);

        System.out.println(juanita);

        //guardar empleados
        empleadoCRUD.guardar(jhon);
        empleadoCRUD.guardar(roberto);
        empleadoCRUD.guardar(juanita);

        //encontrar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}
