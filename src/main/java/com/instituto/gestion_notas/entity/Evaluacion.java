package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evaluaciones")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEvaluacion tipo;

    @Column(nullable = false)
    private Integer porcentaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asignatura_id", nullable = false)
    private Asignatura asignatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "periodo_id", nullable = false)
    private PeriodoEvaluacion periodo;

    @Column(nullable = false)
    private LocalDate fecha;

    public Evaluacion() {}

    public Evaluacion(String nombre, TipoEvaluacion tipo, Integer porcentaje, Asignatura asignatura, PeriodoEvaluacion periodo, LocalDate fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
        this.asignatura = asignatura;
        this.periodo = periodo;
        this.fecha = fecha;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoEvaluacion getTipo() { return tipo; }
    public void setTipo(TipoEvaluacion tipo) { this.tipo = tipo; }

    public Integer getPorcentaje() { return porcentaje; }
    public void setPorcentaje(Integer porcentaje) { this.porcentaje = porcentaje; }

    public Asignatura getAsignatura() { return asignatura; }
    public void setAsignatura(Asignatura asignatura) { this.asignatura = asignatura; }

    public PeriodoEvaluacion getPeriodo() { return periodo; }
    public void setPeriodo(PeriodoEvaluacion periodo) { this.periodo = periodo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
