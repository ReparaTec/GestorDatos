package com.reparatec.reparaTec.repository;

import com.reparatec.reparaTec.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
