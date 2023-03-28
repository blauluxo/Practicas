package com.example.pruebados.restApi;

import com.example.pruebados.service.usuarioServicio;
import org.springframework.web.bind.annotation.*;
import com.example.pruebados.modelo.Usuario;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Usarios/usu")
public class usuarioControlador {

    private final com.example.pruebados.service.usuarioServicio usuarioServicio;

    public usuarioControlador(com.example.pruebados.service.usuarioServicio usuarioServicio) {
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

    public List<Usuario> getTodosUsuarios(){
        return usuarioServicio.getTodosUsuarios();
    }

    public Usuario getUsuariobyNombre(@PathVariable String nombre) {
        return usuarioServicio.getUsuariobyNombre(nombre);
    }

    @DeleteMapping//("/{id}")
    public void borrarUsuario(@PathVariable BigInteger id) {
        usuarioServicio.borrarUsuario(id);
    }

}
