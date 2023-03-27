package com.example.pruebados.tablas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
@EnableJpaRepositories(basePackages = "com.example.pruebados.tablas")
public interface UsuarioRepositorio extends JpaRepository<Usuario, BigInteger> {

List<Usuario> findByNombreContaining(String nombre);


}
