package com.tecsup.demo.servicios;

import com.tecsup.demo.modelo.daos.AlumnoRepository;
import com.tecsup.demo.modelo.documents.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository dao;

    @Override
    public List<Alumno> listar() {
        return dao.findAll();
    }

    @Override
    public Alumno buscar(String id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void grabar(Alumno alumno) {
        dao.save(alumno);
    }

    @Override
    public void eliminar(String id) {
        dao.deleteById(id);
    }
}
