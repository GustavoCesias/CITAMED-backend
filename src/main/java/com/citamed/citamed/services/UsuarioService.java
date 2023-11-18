package com.citamed.citamed.services;

import java.util.Set;

import com.citamed.citamed.entities.Usuario;
import com.citamed.citamed.entities.UsuarioRol;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles)throws Exception;

    public Usuario obtenUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
