package com.livasoft.restaurante.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "mesa")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa",nullable=false)
    private Integer id_mesa;
    @Column(name = "descripcion", nullable = false, length = 50,unique = true)
    private String descripcion;
    @Column(name = "estado_mesa", nullable = false, length = 50)
    private String estado_mesa;
    @Column(name = "cant_pers",nullable=false)
    private Integer cant_pers;
    @Column(name = "piso", nullable = false)
    private Integer piso;
    @Column(name = "fecha_registro")
    private LocalDate fecha_registro;
    @Column(name = "fecha_actualiza")
    private LocalDate fecha_modifica;
    @Column(name = "estado")
    private Boolean estado;

    public Mesa() {
    }

    public Mesa(String descripcion, String estado_mesa, Integer cant_pers, Integer piso, LocalDate fecha_registro, LocalDate fecha_modifica, Boolean estado) {
        this.descripcion = descripcion;
        this.estado_mesa = estado_mesa;
        this.cant_pers = cant_pers;
        this.piso = piso;
        this.fecha_registro = fecha_registro;
        this.fecha_modifica = fecha_modifica;
        this.estado = estado;
    }

    public Mesa(Integer id_mesa, String descripcion, String estado_mesa, Integer cant_pers, Integer piso, LocalDate fecha_registro, LocalDate fecha_modifica, Boolean estado) {
        this.id_mesa = id_mesa;
        this.descripcion = descripcion;
        this.estado_mesa = estado_mesa;
        this.cant_pers = cant_pers;
        this.piso = piso;
        this.fecha_registro = fecha_registro;
        this.fecha_modifica = fecha_modifica;
        this.estado = estado;
    }

    public Integer getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(Integer id_mesa) {
        this.id_mesa = id_mesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado_mesa() {
        return estado_mesa;
    }

    public void setEstado_mesa(String estado_mesa) {
        this.estado_mesa = estado_mesa;
    }

    public Integer getCant_pers() {
        return cant_pers;
    }

    public void setCant_pers(Integer cant_pers) {
        this.cant_pers = cant_pers;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public LocalDate getFecha_modifica() {
        return fecha_modifica;
    }

    public void setFecha_modifica(LocalDate fecha_modifica) {
        this.fecha_modifica = fecha_modifica;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
