package com.poo.coninterfaces;

import com.poo.sininterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD{
    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
