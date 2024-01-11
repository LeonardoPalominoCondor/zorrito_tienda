package com.zorrito.apiproductos.repository;
import com.zorrito.apiproductos.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos para operaciones personalizadas si se necesitan
}