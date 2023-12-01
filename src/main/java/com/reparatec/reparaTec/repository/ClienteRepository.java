package com.reparatec.reparaTec.repository;

import com.reparatec.reparaTec.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Client, Long> {
}
