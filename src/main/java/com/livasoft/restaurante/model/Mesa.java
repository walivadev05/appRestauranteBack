package com.livasoft.restaurante.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "mesa")
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMesa",nullable=false)
    Integer idMesa;
    @Column(name = "nombre", nullable = false, length = 50,unique = true)
    String nombre;
    @Column(name = "estadoMesa", nullable = false, length = 50)
    String estadoMesa;
    @Column(name = "fechaRegistro")
    LocalDate fecha_registro;
    @Column(name = "fechaModifica")
    LocalDate fecha_modifica;
    @Column(name = "estado")
    Boolean estado;

    public Mesa() {

    }

    public Mesa(Integer idMesa, String nombre, String estadoMesa, LocalDate fecha_registro, LocalDate fecha_Modifica, Boolean estado) {
        this.idMesa = idMesa;
        this.nombre = nombre;
        this.estadoMesa = estadoMesa;
        this.fecha_registro = fecha_registro;
        this.fecha_modifica = fecha_Modifica;
        this.estado = estado;
    }

    public Mesa(String nombre, String estadoMesa, LocalDate fecha_registro, LocalDate fecha_Modifica, Boolean estado) {
        this.nombre = nombre;
        this.estadoMesa = estadoMesa;
        this.fecha_registro = fecha_registro;
        this.fecha_modifica = fecha_Modifica;
        this.estado = estado;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public LocalDate getFecha_Modifica() {
        return fecha_modifica;
    }

    public void setFecha_Modifica(LocalDate fecha_Modifica) {
        this.fecha_modifica = fecha_Modifica;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
