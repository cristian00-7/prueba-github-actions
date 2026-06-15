package com.turnoya.turnoyaapi.repository;

import com.turnoya.turnoyaapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Integer> {

    Usuario findByUsuarioAndContrasena(
            String usuario,
            String contrasena
    );

}
