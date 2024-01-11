package com.zorrito.apiproductos.controller;
import com.zorrito.apiproductos.repository.ProductoRepository;
import com.zorrito.apiproductos.repository.UsuarioRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.zorrito.apiproductos.entity.Producto;
import com.zorrito.apiproductos.entity.Usuario;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ProductoRepository productoRepository;
    private final UsuarioRepository usuarioRepository;

    public ApiController(ProductoRepository productoRepository, UsuarioRepository usuarioRepository) {
        this.productoRepository = productoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/productos")
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<String> handleResponseStatusException(ResponseStatusException ex) {
    // Log the exception details for debugging
    ex.printStackTrace();
    // Create a response entity with a custom message and HTTP status code
    return new ResponseEntity<>(ex.getReason(), ex.getStatus());
}

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
    // Log the exception details for debugging
    ex.printStackTrace();
    // Create a response entity with a custom message and HTTP status code
    return new ResponseEntity<>("An unexpected error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
}
}