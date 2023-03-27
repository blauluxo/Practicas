package com.example.pruebados;

import com.example.pruebados.tablas.Usuario;
import com.example.pruebados.tablas.UsuarioRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;





@SpringBootApplication
public class PruebadosApplication {

	static String negro = "\033[30m";
	static  String rojo = "\033[31m";
	static  String verde = "\033[32m";
	static  String azul = "\033[34m";
	static  String morado = "\033[35m";
	static  String cyan = "\033[36m";
	static  String gris = "\033[37m";
	static String reset = "\033[0m";
	static String amarillo = "\033[33m";
	static  String Blanco= "\033[97m";
	static  String Rosado= "\033[95m";
	static  String Celeste= "\033[96m";
	static  String Naranja= "\033[91m";
	static  String Verde_lima= "\033[92m";
	static  String Azul_cielo= "\033[94m";
	public static void main(String[] args) {
		SpringApplication.run(PruebadosApplication.class, args);

	}

	@Bean
	public CommandLineRunner run(UsuarioRepositorio usuario){
		return(args ->{


			boolean salir=false;
			int operacion1;
			String operacion2;
			Scanner teclado = new Scanner(System.in);
			int op=0;

			while(salir==false){


				try {

					while(op<1 || op>9){
						System.out.println(Rosado+"----------------MENU LIGA ACB-------------------"+reset);
						System.out.println(azul+"Introduce la operación a realizar: "+reset);
						System.out.println(azul+"1.Crear un nuevo Usuario"+reset);
						System.out.println(azul+"2.Mostrar todos los usuarios"+reset);
						System.out.println(azul+"3.Modificar un Usuario"+reset);
						System.out.println(azul+"4.Eliminar un usuario"+reset);
						System.out.println(azul+"5.En construccion"+reset);
						System.out.println(azul+"6.En construccion"+reset);
						System.out.println(azul+"7.En construccion"+reset);
						System.out.println(azul+"8.En construccion"+reset);
						System.out.println(azul+"9.Salir"+reset);
						System.out.println(Rosado+"-------------------------------------------------"+reset);
						op = teclado.nextInt();
						teclado.nextLine();

					}
					switch(op)
					{
						case 1:
							op=0;


							System.out.println(azul+"Introduce el nombre del nuevo usuario"+reset);
							String nombre=teclado.nextLine();
							System.out.println(azul+"Introduce el apellido del nuevo usuario"+reset);
							String apellidos=teclado.nextLine();
							System.out.println(azul+"Introduce el usuario del nuevo usuario"+reset);
							String usuarios=teclado.nextLine();
							System.out.println(azul+"Introduce la clave del nuevo usuario"+reset);
							String clave=teclado.nextLine();

							Usuario usuario1 = new Usuario(nombre,apellidos,usuarios,clave);
							AñadirUsuario(usuario, usuario1);

							//llamamos al metodo
							System.out.println(Blanco+"Usuario insertado correctamente"+reset);
							System.out.println(Blanco+"Presione 'Enter' para continuar..."+reset);
							teclado.nextLine();

							break;


						case 2:
							op=0;
							//2. Mostrar los usuarios por nombre
							System.out.println(azul+"Introduce el nombre del usuario que quieres mostrar"+reset);
							nombre=teclado.nextLine();

							System.out.println(	usuario.findByNombreContaining(nombre));
							System.out.println(usuario.findAll());

							List<Usuario> Lista = usuario.findAll();
							if (!Lista.isEmpty()) {
								for (Usuario u : Lista) {
									System.out.println(u.toString());
								}
							} else {
								System.out.println(rojo + "No se encontraron usuarios con ese nombre" + reset);
							}

							System.out.println(Blanco+"Jugador insertado correctamente"+reset);
							System.out.println(Blanco+"Presione 'Enter' para continuar..."+reset);
							teclado.nextLine();

							break;


						case 3:
							op=0;

							//-----------------MOSTRAMOS TODOS LOS USUARIOS--------------
							System.out.println(usuario.findAll());

							// Lo primero es conseguir el ID del usuario que se quiere modificar
							System.out.println(azul + "Introduce el ID del usuario que quieres modificar: " + reset);
							BigInteger id = new BigInteger(teclado.nextLine());

							// Buscamos el usuario por el  ID
							//El optional lo que hace esque te coge un usuario y lo mete en esa variable
							//y esa varibale acepta nulos, entonces si es nulo no te da error.

							//tambien se puede hacer como en el case 4.
							Optional<Usuario> optionalUsuario = usuario.findById(id);
							if (optionalUsuario.isPresent()) {
								// Si se encuentra el usuario, se piden los nuevos datos
								Usuario usuarioExistente = optionalUsuario.get();

								System.out.println(azul + "Introduce la nueva clave: " + reset);
								String nuevaClave = teclado.nextLine();
								usuarioExistente.setClave(nuevaClave);

								// Guardar los cambios
								usuario.save(usuarioExistente);

								System.out.println(Blanco + "Usuario modificado correctamente" + reset);
							} else {
								System.out.println(rojo + "No se encontró ningún usuario con ese ID" + reset);
							}

							break;
						case 4:
							op=0;

							//-----------------MOSTRAMOS TODOS LOS USUARIOS--------------
							System.out.println(usuario.findAll());


							System.out.println("Eliminar usuario:");
							System.out.print("Ingresa el ID del usuario a eliminar: ");
							BigInteger ids = new BigInteger(teclado.nextLine());

							if (usuario.existsById(ids)) {

								usuario.deleteById(ids);
								System.out.println("El usuario con ID " + ids + " ha sido eliminado.");

							} else {
								System.out.println("El usuario con ID " + ids+ " no existe.");
							}


							break;

						case 5:
							op=0;

							break;


						case 6:
							op=0;

							break;
						case 7:
							op=0;


							break;
						case 8:
							op=0;

							break;
						case 9:
							op=0;
							System.out.println(Celeste+"Adios"+reset);
							salir=true;
							System.exit(0);
							break;
						default:

							System.out.println("Opción no válida");
					}
				}catch (InputMismatchException as){
					System.out.println(rojo+"Solo se aceptan numeros enteros, del 1 al 8"+reset);
					System.out.println(rojo+"Intentelo de nuevo"+reset);
					op=0;
					teclado.nextLine();
					System.out.println("Presione 'Enter' para continuar...");
					teclado.nextLine();
				}

			}//AQUI TERMINA EL WHILE(SALIR==FALSE)








		});
	}
	private static void AñadirUsuario(UsuarioRepositorio usuario, Usuario usuarioNuevo) {

		usuario.save(usuarioNuevo);

	}



}
