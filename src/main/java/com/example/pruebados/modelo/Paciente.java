package com.example.pruebados.modelo;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name="Paciente")
public class Paciente extends Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PACIENTE_ID")
    private Integer pacienteId;
    @Basic
    @Column(name = "NSS")
    private String nss;
    @Basic
    @Column(name = "NUMTARJETA")
    private String numtarjeta;
    @Basic
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic
    @Column(name = "DIRECCION")
    private String direccion;

//------------esto es para la relacion 1 a muchos de entre paciente y medico----------

    @ManyToMany
    @JoinTable(
            name = "medicoPaciente",
            joinColumns = @JoinColumn(name = "PACIENTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "MEDICO_ID")
    )
    private List<Medico> medicos = new ArrayList<>();

    /*
    @OneToOne
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID", nullable = false, insertable=false, updatable=false)
    private Usuario usuario;

    @Basic
    @Column(name = "MEDICO_ID")
    private Integer medicoId;

    @Basic
    @Column(name = "MEDICO_ID")
    private Integer medicoId;
    */

/*
    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
*/
    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }
/*
    public Integer getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Integer medicoId) {
        this.medicoId = medicoId;
    }
*/
   // public Usuario getUsuario() {
     //   return usuario;
   // }
/*
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        //if (pacienteId != paciente.pacienteId) return false;
      //  if (medicoId != paciente.medicoId) return false;
    //    if (usuarioId != null ? !usuarioId.equals(paciente.usuarioId) : paciente.usuarioId != null) return false;
        if (nss != null ? !nss.equals(paciente.nss) : paciente.nss != null) return false;
        if (numtarjeta != null ? !numtarjeta.equals(paciente.numtarjeta) : paciente.numtarjeta != null) return false;
        if (telefono != null ? !telefono.equals(paciente.telefono) : paciente.telefono != null) return false;
        if (direccion != null ? !direccion.equals(paciente.direccion) : paciente.direccion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pacienteId, nss, numtarjeta, telefono, direccion);
    }
}
