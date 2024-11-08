package org.example.tp3.repositories;

import org.example.tp3.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByEmail(String email);
    List<Utilisateur> findByRole_Nom(String nomRole);
}
