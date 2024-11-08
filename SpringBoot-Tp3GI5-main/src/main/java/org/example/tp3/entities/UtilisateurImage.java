package org.example.tp3.entities;

import jakarta.persistence.*;

@Entity
public class UtilisateurImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomImage;
    private String cheminImage;

    @OneToOne(mappedBy = "utilisateurImage")
    private Utilisateur utilisateur;


}
