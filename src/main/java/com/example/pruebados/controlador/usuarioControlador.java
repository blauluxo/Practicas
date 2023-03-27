package com.example.pruebados.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.pruebados.tablas.UsuarioRepositorio;
import com.example.pruebados.tablas.Usuario;

import java.math.BigInteger;

@RestController
@RequestMapping("/Usarios")
public class usuarioControlador {

    private final usuarioServicio usuarioServicio;

    public usuarioControlador(com.example.pruebados.controlador.usuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuarios){
        return usuarioServicio.crearUsuario(usuarios);
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioByID(@PathVariable BigInteger id) {
    return usuarioServicio.getUsuariobyID(id);
    }



}
