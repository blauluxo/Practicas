package com.example.pruebados.tablas;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigInteger;

public class PacientemedicoPK implements Serializable {
    @Column(name = "PACIENTE_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger pacienteId;
    @Column(name = "MEDICO_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger medicoId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacientemedicoPK that = (PacientemedicoPK) o;

        if (pacienteId != null ? !pacienteId.equals(that.pacienteId) : that.pacienteId != null) return false;
        if (medicoId != null ? !medicoId.equals(that.medicoId) : that.medicoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pacienteId != null ? pacienteId.hashCode() : 0;
        result = 31 * result + (medicoId != null ? medicoId.hashCode() : 0);
        return result;
    }
}
