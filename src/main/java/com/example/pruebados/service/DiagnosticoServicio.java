package com.example.pruebados.service;

import com.example.pruebados.modelo.Diagnostico;
import com.example.pruebados.modelo.Medico;
import com.example.pruebados.repositorio.DiagnosticoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticoServicio {

    private final DiagnosticoRepositorio diagnosticoRepositorio;

    public DiagnosticoServicio(DiagnosticoRepositorio diagnosticoRepositorio) {
        this.diagnosticoRepositorio = diagnosticoRepositorio;
    }

    public Diagnostico crearDiagnostico (Diagnostico diagnostico){
        return diagnosticoRepositorio.save(diagnostico);
    }

    public List<Diagnostico> getTodosDiagnosticos(){
        return diagnosticoRepositorio.findAll();
    }


}
