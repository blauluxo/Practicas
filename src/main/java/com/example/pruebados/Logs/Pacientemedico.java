package com.example.pruebados.Logs;

import jakarta.persistence.*;

import java.util.List;
/*
@Entity
@Table (name="PacienteMedico")
*/

public class Pacientemedico {
/*
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PACIENTE_ID",nullable = false, insertable=false, updatable=false)
    private Integer pacienteId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MEDICO_ID", nullable = false, insertable=false, updatable=false)
    private Integer medicoId;


    //-------------vamos a hacer la relacion---------------
    @ManyToMany
    @JoinColumn(name = "PACIENTE_ID", referencedColumnName = "PACIENTE_ID")
    private List<Paciente> pacientes;

    @ManyToMany
    @JoinColumn(name = "MEDICO_ID", referencedColumnName = "MEDICO_ID")
    private List<Medico> medicos;;




    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Integer getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Integer medicoId) {
        this.medicoId = medicoId;
    }


    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
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


 */
}
