package com.poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //emulando una base de datos
    List<Empleado> empleados = new ArrayList<>();

    public  void guardar(Empleado empleado){
        empleados.add(empleado);

    }

    public List<Empleado> findAll() {
        return empleados;
    }
}
