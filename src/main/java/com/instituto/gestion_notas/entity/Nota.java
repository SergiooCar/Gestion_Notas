package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id", nullable = false)
    private Usuario alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evaluacion_id", nullable = false)
    private Evaluacion evaluacion;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal valor;

    @Column(columnDefinition = "TEXT")
    private String comentario;

    public Nota() {}

    public Nota(Usuario alumno, Evaluacion evaluacion, BigDecimal valor, String comentario) {
        this.alumno = alumno;
        this.evaluacion = evaluacion;
        this.valor = valor;
        this.comentario = comentario;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getAlumno() { return alumno; }
    public void setAlumno(Usuario alumno) { this.alumno = alumno; }

    public Evaluacion getEvaluacion() { return evaluacion; }
    public void setEvaluacion(Evaluacion evaluacion) { this.evaluacion = evaluacion; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
}
