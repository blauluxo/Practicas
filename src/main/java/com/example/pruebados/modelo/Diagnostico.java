package com.example.pruebados.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name="Diagnostico")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Diagnostico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_DIAGNOSTICO")
    private BigInteger idDiagnostico;
    @Basic
    @Column(name = "VALORACIONESPECIALISTA")
    private String valoracionespecialista;
    @Basic
    @Column(name = "ENFERMEDAD")
    private String enfermedad;
    @Basic
    @Column(name = "CITA_ID")
    private BigInteger citaId;
    @OneToOne
    @JoinColumn(name = "CITA_ID", referencedColumnName = "ID_CITA", nullable = false, insertable=false, updatable=false)
    private Cita citaByCitaId;

    public BigInteger getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(BigInteger idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getValoracionespecialista() {
        return valoracionespecialista;
    }

    public void setValoracionespecialista(String valoracionespecialista) {
        this.valoracionespecialista = valoracionespecialista;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public BigInteger getCitaId() {
        return citaId;
    }

    public void setCitaId(BigInteger citaId) {
        this.citaId = citaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diagnostico that = (Diagnostico) o;

        if (idDiagnostico != null ? !idDiagnostico.equals(that.idDiagnostico) : that.idDiagnostico != null)
            return false;
        if (valoracionespecialista != null ? !valoracionespecialista.equals(that.valoracionespecialista) : that.valoracionespecialista != null)
            return false;
        if (enfermedad != null ? !enfermedad.equals(that.enfermedad) : that.enfermedad != null) return false;
        if (citaId != null ? !citaId.equals(that.citaId) : that.citaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDiagnostico != null ? idDiagnostico.hashCode() : 0;
        result = 31 * result + (valoracionespecialista != null ? valoracionespecialista.hashCode() : 0);
        result = 31 * result + (enfermedad != null ? enfermedad.hashCode() : 0);
        result = 31 * result + (citaId != null ? citaId.hashCode() : 0);
        return result;
    }

    public Cita getCitaByCitaId() {
        return citaByCitaId;
    }

    public void setCitaByCitaId(Cita citaByCitaId) {
        this.citaByCitaId = citaByCitaId;
    }
}
