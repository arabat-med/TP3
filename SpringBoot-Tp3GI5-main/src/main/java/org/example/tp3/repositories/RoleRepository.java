package org.example.tp3.repositories;

import org.example.tp3.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNom(String nom);
}

