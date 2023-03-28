package com.example.pruebados.modelo;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table (name="Paciente")
public class Paciente {

    public Paciente(BigInteger usuarioId, String nss, String numtarjeta, String telefono, String direccion) {
        this.usuarioId = usuarioId;
        this.nss = nss;
        this.numtarjeta = numtarjeta;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Paciente() {

    }
    @Basic
    @Column(name = "USUARIO_ID")
    private BigInteger usuarioId;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PACIENTE_ID")
    private BigInteger pacienteId;
    @Basic
    @Column(name = "MEDICO_ID")
    private BigInteger medicoId;


    @OneToOne
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID", nullable = false, insertable=false, updatable=false)
    private Usuario usuario;



    public BigInteger getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(BigInteger usuarioId) {
        this.usuarioId = usuarioId;
    }

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

    public BigInteger getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(BigInteger pacienteId) {
        this.pacienteId = pacienteId;
    }

    public BigInteger getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(BigInteger medicoId) {
        this.medicoId = medicoId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        //if (pacienteId != paciente.pacienteId) return false;
      //  if (medicoId != paciente.medicoId) return false;
        if (usuarioId != null ? !usuarioId.equals(paciente.usuarioId) : paciente.usuarioId != null) return false;
        if (nss != null ? !nss.equals(paciente.nss) : paciente.nss != null) return false;
        if (numtarjeta != null ? !numtarjeta.equals(paciente.numtarjeta) : paciente.numtarjeta != null) return false;
        if (telefono != null ? !telefono.equals(paciente.telefono) : paciente.telefono != null) return false;
        if (direccion != null ? !direccion.equals(paciente.direccion) : paciente.direccion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usuarioId != null ? usuarioId.hashCode() : 0;
        result = 31 * result + (nss != null ? nss.hashCode() : 0);
        result = 31 * result + (numtarjeta != null ? numtarjeta.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
    //    result = 31 * result + (int) (pacienteId ^ (pacienteId >>> 32));
     //   result = 31 * result + (int) (medicoId ^ (medicoId >>> 32));
        return result;
    }


}
