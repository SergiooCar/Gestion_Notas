package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "periodos_evaluacion")
public class PeriodoEvaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    public PeriodoEvaluacion() {}

    public PeriodoEvaluacion(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
