package com.citamed.citamed.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.citamed.citamed.entities.Rol;
import com.citamed.citamed.entities.Usuario;
import com.citamed.citamed.entities.UsuarioRol;
import com.citamed.citamed.services.UsuarioService;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        usuario.setPerfil("default.png");
        Set<UsuarioRol> roles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolID(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario, roles);

    }
    
    @GetMapping("/{username}")
    public Usuario obtenUsuario(@PathVariable("username") String username){
        return usuarioService.obtenUsuario(username);
    }

    @DeleteMapping("/{usurioId}")
    public void eliminarUsuario(@PathVariable("usurioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);

    }
}
