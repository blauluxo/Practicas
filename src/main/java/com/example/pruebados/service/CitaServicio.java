package com.example.pruebados.service;

import com.example.pruebados.modelo.Cita;
import com.example.pruebados.modelo.Medico;
import com.example.pruebados.repositorio.CitaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServicio {

    private final CitaRepositorio citaRepositorio;

    public CitaServicio(CitaRepositorio citaRepositorio) {
        this.citaRepositorio = citaRepositorio;
    }

    public Cita crearCita (Cita cita){
        return citaRepositorio.save(cita);
    }

    public List<Cita> getTodasCitas(){
        return citaRepositorio.findAll();
    }

}
