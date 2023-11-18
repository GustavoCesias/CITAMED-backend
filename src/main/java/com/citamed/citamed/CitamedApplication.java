package com.citamed.citamed;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citamed.citamed.entities.Rol;
import com.citamed.citamed.entities.Usuario;
import com.citamed.citamed.entities.UsuarioRol;
import com.citamed.citamed.services.UsuarioService;

@SpringBootApplication
public class CitamedApplication implements CommandLineRunner{

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(CitamedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario = new Usuario();

		usuario.setNombre("GUSTAVO");
		usuario.setApellido("CESIAS");
		usuario.setUsername("cesi");
		usuario.setPassword("123456");
		usuario.setEmail("c1@gmail.com");
		usuario.setEdad("21");
		usuario.setTelefono("952651489");
		usuario.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setRolID(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new  UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/

	}

}
