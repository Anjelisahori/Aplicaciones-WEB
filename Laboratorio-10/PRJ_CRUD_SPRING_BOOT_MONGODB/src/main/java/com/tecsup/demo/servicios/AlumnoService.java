package com.tecsup.demo.servicios;

import com.tecsup.demo.modelo.documents.Alumno;
import java.util.List;

public interface AlumnoService {

    List<Alumno> listar();

    Alumno buscar(String id);

    void grabar(Alumno alumno);

    void eliminar(String id);
}
