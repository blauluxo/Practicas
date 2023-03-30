package com.example.pruebados.restApi;

import com.example.pruebados.modelo.Paciente;
import com.example.pruebados.service.PacienteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteControlador {

    private final PacienteServicio pacienteServicio;
    //esto es el cosntructor
    public PacienteControlador(PacienteServicio pacienteServicio) {
        this.pacienteServicio = pacienteServicio;
    }


    @PostMapping
    public Paciente crearPaciente(@RequestBody Paciente paciente){
        return pacienteServicio.crearPaciente(paciente);
    }

    @GetMapping("/lista")
    public List<Paciente> getTodosPacientes(){
        return pacienteServicio.getTodosPaciente();
    }

}
