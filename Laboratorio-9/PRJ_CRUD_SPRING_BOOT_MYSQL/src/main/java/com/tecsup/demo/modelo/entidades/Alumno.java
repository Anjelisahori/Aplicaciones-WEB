package com.tecsup.demo.modelo.entidades;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Alumno")
public class Alumno {

    @Id
    @Column(name = "chrAluCodigo", length = 10)
    private String codigo;

    @Column(name = "vchAluNombres", length = 50)
    private String nombres;

    @Column(name = "vchAluApellidos", length = 50)
    private String apellidos;

    @Column(name = "dtmAluFechaNac")
    private LocalDate fechaNacimiento;

    @Column(name = "chrAluSexo", length = 1)
    private String sexo;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
