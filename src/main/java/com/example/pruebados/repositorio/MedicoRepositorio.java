package com.example.pruebados.repositorio;

import com.example.pruebados.modelo.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
@EnableJpaRepositories(basePackages = "com.example.pruebados.modelo")

public interface MedicoRepositorio extends JpaRepository<Medico, Integer> {

List<Medico> findAll();
}
