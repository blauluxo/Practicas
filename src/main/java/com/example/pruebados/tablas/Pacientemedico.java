package com.example.pruebados.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name="Pacientemedico")
@Data
@AllArgsConstructor
@NoArgsConstructor

@IdClass(PacientemedicoPK.class)
public class Pacientemedico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PACIENTE_ID")
    private BigInteger pacienteId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MEDICO_ID")
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

        Pacientemedico that = (Pacientemedico) o;

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
