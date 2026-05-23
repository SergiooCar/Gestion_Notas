package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id", nullable = false)
    private Usuario alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @Column(name = "fecha_matricula", nullable = false)
    private LocalDate fechaMatricula;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoMatricula estado;

    public Matricula() {}

    public Matricula(Usuario alumno, Curso curso, LocalDate fechaMatricula, EstadoMatricula estado) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getAlumno() { return alumno; }
    public void setAlumno(Usuario alumno) { this.alumno = alumno; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public LocalDate getFechaMatricula() { return fechaMatricula; }
    public void setFechaMatricula(LocalDate fechaMatricula) { this.fechaMatricula = fechaMatricula; }

    public EstadoMatricula getEstado() { return estado; }
    public void setEstado(EstadoMatricula estado) { this.estado = estado; }
}
