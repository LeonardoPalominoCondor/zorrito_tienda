package com.zorrito.apiproductos.repository;
import com.zorrito.apiproductos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos para operaciones personalizadas si se necesitan
}