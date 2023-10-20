package com.car.repository;

import com.car.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario save(Usuario usuario);

    // Buscar un usuario por ID
    Optional<Usuario> findById(Long id);

    // Obtener todos los usuarios
    List<Usuario> findAll();

    // Eliminar un usuario por ID
    void deleteById(Long id);
}

