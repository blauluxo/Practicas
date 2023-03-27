package com.example.pruebados.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Collection;

@Entity
@Table(name="Medico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "USUARIO_ID")
    private BigInteger usuarioId;
    @Basic
    @Column(name = "NUMCOLEGIADO")
    private String numcolegiado;

    /*
    @OneToMany(mappedBy = "medicoByMedicoId")
    private Collection<Cita> citasByUsuarioId;

     */
    @OneToOne
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID", nullable = false, insertable=false, updatable=false)
    private Usuario usuarioByUsuarioId;


  //  @OneToMany(mappedBy = "medicoByMedicoId")
   // private Collection<Pacientemedico> pacientemedicosByUsuarioId;

    public BigInteger getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(BigInteger usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNumcolegiado() {
        return numcolegiado;
    }

    public void setNumcolegiado(String numcolegiado) {
        this.numcolegiado = numcolegiado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medico medico = (Medico) o;

        if (usuarioId != null ? !usuarioId.equals(medico.usuarioId) : medico.usuarioId != null) return false;
        if (numcolegiado != null ? !numcolegiado.equals(medico.numcolegiado) : medico.numcolegiado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usuarioId != null ? usuarioId.hashCode() : 0;
        result = 31 * result + (numcolegiado != null ? numcolegiado.hashCode() : 0);
        return result;
    }

   // public Collection<Cita> getCitasByUsuarioId() {
   //     return citasByUsuarioId;
   // }

    //public void setCitasByUsuarioId(Collection<Cita> citasByUsuarioId) {
     //   this.citasByUsuarioId = citasByUsuarioId;
   // }

    public Usuario getUsuarioByUsuarioId() {
        return usuarioByUsuarioId;
    }

    public void setUsuarioByUsuarioId(Usuario usuarioByUsuarioId) {
        this.usuarioByUsuarioId = usuarioByUsuarioId;
    }

   // public Collection<Pacientemedico> getPacientemedicosByUsuarioId() {
    //    return pacientemedicosByUsuarioId;
    //}

    //public void setPacientemedicosByUsuarioId(Collection<Pacientemedico> pacientemedicosByUsuarioId) {
    //    this.pacientemedicosByUsuarioId = pacientemedicosByUsuarioId;
    //}
}
