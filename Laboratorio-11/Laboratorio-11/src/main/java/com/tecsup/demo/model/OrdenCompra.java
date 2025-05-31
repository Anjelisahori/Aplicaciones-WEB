package com.tecsup.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nroOrdenC;

    private LocalDate fechaEmision;
    private String situacion;
    private Double total;
    private String nroFacturaProv;

    @ManyToOne
    @JoinColumn(name = "codLab", nullable = false)
    @JsonBackReference
    private Laboratorio laboratorio;

    // Getters y Setters

    public Long getNroOrdenC() {
        return nroOrdenC;
    }

    public void setNroOrdenC(Long nroOrdenC) {
        this.nroOrdenC = nroOrdenC;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNroFacturaProv() {
        return nroFacturaProv;
    }

    public void setNroFacturaProv(String nroFacturaProv) {
        this.nroFacturaProv = nroFacturaProv;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
