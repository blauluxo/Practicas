package com.example.pruebados.service;

import com.example.pruebados.modelo.Paciente;
import com.example.pruebados.repositorio.PacienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {


    private final PacienteRepositorio pacienteRepositorio;

// es el constructor
    public PacienteServicio(PacienteRepositorio pacienteRepositorio) {
        this.pacienteRepositorio = pacienteRepositorio;
    }

   //aqui los metodos
   public Paciente crearPaciente(Paciente paciente){
        return pacienteRepositorio.save(paciente);
   }

   public List<Paciente> getTodosPaciente(){
        return pacienteRepositorio.findAll();
   }



}
