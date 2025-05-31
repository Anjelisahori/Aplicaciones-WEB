package com.tecsup.demo.controller;

import com.tecsup.demo.model.Laboratorio;
import com.tecsup.demo.repository.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    @Autowired
    private LaboratorioRepository laboratorioRepository;

    @GetMapping
    public List<Laboratorio> listar() {
        return laboratorioRepository.findAll();
    }

    @PostMapping
    public Laboratorio crear(@RequestBody Laboratorio lab) {
        return laboratorioRepository.save(lab);
    }

    @PutMapping("/{id}")
    public Laboratorio actualizar(@PathVariable Long id, @RequestBody Laboratorio nuevo) {
        Laboratorio l = laboratorioRepository.findById(id).orElseThrow();
        l.setRazonSocial(nuevo.getRazonSocial());
        l.setDireccion(nuevo.getDireccion());
        l.setTelefono(nuevo.getTelefono());
        l.setEmail(nuevo.getEmail());
        l.setContacto(nuevo.getContacto());
        return laboratorioRepository.save(l);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        laboratorioRepository.deleteById(id);
    }
}
