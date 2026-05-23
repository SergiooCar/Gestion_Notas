package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "anio_escolar", nullable = false, length = 20)
    private String anioEscolar;

    public Curso() {}

    public Curso(String nombre, String anioEscolar) {
        this.nombre = nombre;
        this.anioEscolar = anioEscolar;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getAnioEscolar() { return anioEscolar; }
    public void setAnioEscolar(String anioEscolar) { this.anioEscolar = anioEscolar; }
}
