package org.example.tp3.controllers;

import org.example.tp3.entities.Utilisateur;
import org.example.tp3.entities.UtilisateurImage;
import org.example.tp3.repositories.UtilisateurRepository;
import org.example.tp3.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {
    private final UtilisateurService utilisateurService;
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurService utilisateurService, UtilisateurRepository utilisateurRepository) {
        this.utilisateurService = utilisateurService;
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @PostMapping
    public Utilisateur creerUtilisateur(@RequestBody Utilisateur utilisateur, @RequestParam Long roleId) {
        return utilisateurService.creerUtilisateur(utilisateur, roleId);
    }

    @PostMapping("/{utilisateurId}/image")
    public Utilisateur ajouterImage(@PathVariable Long utilisateurId, @RequestBody UtilisateurImage image) {
        return utilisateurService.ajouterImage(utilisateurId, image);
    }
}

