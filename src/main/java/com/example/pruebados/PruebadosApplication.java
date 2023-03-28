package com.example.pruebados;

import com.example.pruebados.modelo.Usuario;
import com.example.pruebados.repositorio.UsuarioRepositorio;
import com.example.pruebados.restApi.usuarioControlador;
import com.example.pruebados.service.usuarioServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class PruebadosApplication {


	public static void main(String[] args) {
		SpringApplication.run(PruebadosApplication.class, args);

	}



}
