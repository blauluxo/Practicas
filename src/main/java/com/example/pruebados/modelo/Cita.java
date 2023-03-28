package com.example.pruebados.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Date;

@Entity
@Data
@Table(name="Cita")
@AllArgsConstructor
@NoArgsConstructor

public class Cita {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CITA")
    private BigInteger idCita;

    @Basic
    @Column(name = "FECHAHORA")
    private Date fechahora;
    @Basic
    @Column(name = "MOTIVOCITA")
    private String motivocita;
    @Basic
    @Column(name = "ATRIBUTO11")
    private BigInteger atributo11;


    //esta son las referencias a las otras entiendades
    @Basic
    @Column(name = "PACIENTE_ID")
    private BigInteger pacienteId;
    @Basic
    @Column(name = "MEDICO_ID")
    private BigInteger medicoId;


//---------------la relacion como un paciente o medico, puede o no, tener muchas citas
    @ManyToOne
    @JoinColumn(name = "PACIENTE_ID", referencedColumnName = "PACIENTE_ID", nullable = false, insertable=false, updatable=false)
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "MEDICO_ID", referencedColumnName = "MEDICO_ID", nullable = false, insertable=false, updatable=false)
    private Medico medico;

    public BigInteger getIdCita() {
        return idCita;
    }

    public void setIdCita(BigInteger idCita) {
        this.idCita = idCita;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public String getMotivocita() {
        return motivocita;
    }

    public void setMotivocita(String motivocita) {
        this.motivocita = motivocita;
    }

    public BigInteger getAtributo11() {
        return atributo11;
    }

    public void setAtributo11(BigInteger atributo11) {
        this.atributo11 = atributo11;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cita cita = (Cita) o;

        if (idCita != null ? !idCita.equals(cita.idCita) : cita.idCita != null) return false;
        if (fechahora != null ? !fechahora.equals(cita.fechahora) : cita.fechahora != null) return false;
        if (motivocita != null ? !motivocita.equals(cita.motivocita) : cita.motivocita != null) return false;
        if (atributo11 != null ? !atributo11.equals(cita.atributo11) : cita.atributo11 != null) return false;
        if (pacienteId != null ? !pacienteId.equals(cita.pacienteId) : cita.pacienteId != null) return false;
        if (medicoId != null ? !medicoId.equals(cita.medicoId) : cita.medicoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCita != null ? idCita.hashCode() : 0;
        result = 31 * result + (fechahora != null ? fechahora.hashCode() : 0);
        result = 31 * result + (motivocita != null ? motivocita.hashCode() : 0);
        result = 31 * result + (atributo11 != null ? atributo11.hashCode() : 0);
        result = 31 * result + (pacienteId != null ? pacienteId.hashCode() : 0);
        result = 31 * result + (medicoId != null ? medicoId.hashCode() : 0);
        return result;
    }
}
