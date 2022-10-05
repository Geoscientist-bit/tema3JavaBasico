package com.poo.coninterfaces;

import com.poo.sininterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {

    //SOLO DECLARAN METODOS, NO SE IMPLEMENTAN

    //actua un contrato de lo que hayu que hacer

    void guardar(Empleado empleado);

    List<Empleado> findAll();

    void  delete(Empleado empleado);
}
