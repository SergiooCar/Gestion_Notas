package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id", nullable = false)
    private Usuario profesor;

    public Asignatura() {}

    public Asignatura(String nombre, Curso curso, Usuario profesor) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public Usuario getProfesor() { return profesor; }
    public void setProfesor(Usuario profesor) { this.profesor = profesor; }
}
