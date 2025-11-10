package com.turnoya.turnoya.controller;

import com.turnoya.turnoya.model.Usuario;
import com.turnoya.turnoya.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*") // Permitir peticiones desde tu HTML local
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // 🟢 Registrar nuevo usuario
    @PostMapping("/registrar")
    public String registrar(@RequestBody Usuario usuario) {
        if (usuarioRepository.findByNombreUsuario(usuario.getNombreUsuario()) != null) {
            return "EXISTE";
        }
        usuarioRepository.save(usuario);
        return "OK";
    }

    // 🟢 Login
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {
        Usuario userDB = usuarioRepository.findByNombreUsuario(usuario.getNombreUsuario());
        if (userDB != null && userDB.getContrasena().equals(usuario.getContrasena())) {
            return userDB;
        }
        return null;
    }
}
