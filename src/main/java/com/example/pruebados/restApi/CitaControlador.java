package com.example.pruebados.restApi;

import com.example.pruebados.modelo.Cita;
import com.example.pruebados.modelo.Medico;
import com.example.pruebados.service.CitaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaControlador {
//DTOs MAPS STRUTS  //IMPLEMENTA SERIALIZABLE
   private final CitaServicio citaServicio;

    public CitaControlador(CitaServicio citaServicio) {
        this.citaServicio = citaServicio;
    }

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita){
        return citaServicio.crearCita(cita);
    }

    @GetMapping("/lista")
    public List<Cita> getTodosPacientes(){
        return citaServicio.getTodasCitas();
    }



}
