package com.tecsup.demo.servicios;

import com.tecsup.demo.modelo.entidades.Alumno;

public interface AlumnoService {
    Iterable<Alumno> listarTodos();
    Alumno guardar(Alumno alumno);
    Alumno obtenerPorId(String codigo);
    void eliminar(String codigo);
}
