package com.citamed.citamed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citamed.citamed.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUsername(String username);

    

}
