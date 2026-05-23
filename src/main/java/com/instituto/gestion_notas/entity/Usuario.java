package com.instituto.gestion_notas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado usuarioEstado;

    public Usuario(){}

    public Usuario(String email, String password, String nombre, Rol rol, Estado estado){
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
        this.usuarioEstado = estado;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Estado getUsuarioEstado() {
        return usuarioEstado;
    }
    public void setUsuarioEstado(Estado usuarioEstado) {
        this.usuarioEstado = usuarioEstado;
    }
}

