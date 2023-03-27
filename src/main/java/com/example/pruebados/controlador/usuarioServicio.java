package com.example.pruebados.controlador;

import com.example.pruebados.tablas.Usuario;
import com.example.pruebados.tablas.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class usuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public usuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario crearUsuario(Usuario usuario){
         return usuarioRepositorio.save(usuario);
    }

    public Usuario getUsuariobyID(BigInteger id){
        return usuarioRepositorio.findById(id).get();
    }

}
