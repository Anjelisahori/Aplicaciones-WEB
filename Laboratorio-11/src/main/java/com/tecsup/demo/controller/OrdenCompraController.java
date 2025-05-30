package com.tecsup.demo.controller;

import com.tecsup.demo.model.OrdenCompra;
import com.tecsup.demo.repository.OrdenCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenescompra")
public class OrdenCompraController {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    @GetMapping
    public List<OrdenCompra> listar() {
        return ordenCompraRepository.findAll();
    }

    @PostMapping
    public OrdenCompra crear(@RequestBody OrdenCompra orden) {
        return ordenCompraRepository.save(orden);
    }

    @PutMapping("/{id}")
    public OrdenCompra actualizar(@PathVariable Long id, @RequestBody OrdenCompra nuevo) {
        OrdenCompra o = ordenCompraRepository.findById(id).orElseThrow();
        o.setFechaEmision(nuevo.getFechaEmision());
        o.setSituacion(nuevo.getSituacion());
        o.setTotal(nuevo.getTotal());
        o.setNroFacturaProv(nuevo.getNroFacturaProv());
        o.setLaboratorio(nuevo.getLaboratorio());
        return ordenCompraRepository.save(o);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ordenCompraRepository.deleteById(id);
    }
}
