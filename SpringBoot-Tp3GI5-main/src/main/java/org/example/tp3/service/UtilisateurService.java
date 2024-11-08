package org.example.tp3.service;

import org.example.tp3.entities.Role;
import org.example.tp3.entities.Utilisateur;
import org.example.tp3.entities.UtilisateurImage;
import org.example.tp3.repositories.RoleRepository;
import org.example.tp3.repositories.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    private final RoleRepository roleRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, RoleRepository roleRepository) {
        this.utilisateurRepository = utilisateurRepository;
        this.roleRepository = roleRepository;
    }

    public Utilisateur creerUtilisateur(Utilisateur utilisateur, Long roleId) {
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role non trouvé"));
        utilisateur.setRole(role);
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur ajouterImage(Long utilisateurId, UtilisateurImage image) {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        utilisateur.setUtilisateurImage(image);
        return utilisateurRepository.save(utilisateur);
    }
}

