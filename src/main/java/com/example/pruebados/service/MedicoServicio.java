package com.example.pruebados.service;

import com.example.pruebados.modelo.Medico;
import com.example.pruebados.repositorio.MedicoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {

    private final MedicoRepositorio medicoRepositorio;
    // es el constructor
    public MedicoServicio(MedicoRepositorio medicoRepositorio) {
        this.medicoRepositorio = medicoRepositorio;
    }
    //aqui los metodos
    public Medico crearMedico(Medico medico){
        return medicoRepositorio.save(medico);
    }

    public List<Medico> getTodosMedicos(){
        return medicoRepositorio.findAll();
    }

}
