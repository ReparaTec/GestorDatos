package com.reparatec.reparaTec.service;

import com.reparatec.reparaTec.models.Usuario;
import com.reparatec.reparaTec.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
