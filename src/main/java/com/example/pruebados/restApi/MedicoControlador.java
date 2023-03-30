package com.example.pruebados.restApi;

import com.example.pruebados.modelo.Medico;
import com.example.pruebados.modelo.Paciente;
import com.example.pruebados.service.MedicoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoControlador {

    private final MedicoServicio medicoServicio;


    public MedicoControlador(MedicoServicio medicoServicio) {
        this.medicoServicio = medicoServicio;
    }


    @PostMapping
    public Medico crearPaciente(@RequestBody Medico medico){
        return medicoServicio.crearMedico(medico);
    }

    @GetMapping("/lista")
    public List<Medico> getTodosPacientes(){
        return medicoServicio.getTodosMedicos();
    }


}
