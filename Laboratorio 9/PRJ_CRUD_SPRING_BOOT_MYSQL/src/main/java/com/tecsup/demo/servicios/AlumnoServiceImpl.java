package com.tecsup.demo.servicios;
import com.tecsup.demo.modelo.daos.AlumnoRepository;
import com.tecsup.demo.modelo.entidades.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Iterable<Alumno> listarTodos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno obtenerPorId(String codigo) {
        return alumnoRepository.findById(codigo).orElse(null);
    }

    @Override
    public void eliminar(String codigo) {
        alumnoRepository.deleteById(codigo);
    }
}
