package com.example.pruebados.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name="Usuario")
@Data
public class Usuario {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic
    @Column(name = "USUAIO")
    private String usuaio;
    @Basic
    @Column(name = "CLAVE")
    private String clave;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuaio() {
        return usuaio;
    }

    public void setUsuaio(String usuaio) {
        this.usuaio = usuaio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (id != null ? !id.equals(usuario.id) : usuario.id != null) return false;
        if (nombre != null ? !nombre.equals(usuario.nombre) : usuario.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(usuario.apellidos) : usuario.apellidos != null) return false;
        if (usuaio != null ? !usuaio.equals(usuario.usuaio) : usuario.usuaio != null) return false;
        if (clave != null ? !clave.equals(usuario.clave) : usuario.clave != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (usuaio != null ? usuaio.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        return result;
    }
}
