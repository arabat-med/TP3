package org.example.tp3.entities;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @ManyToOne
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    private UtilisateurImage utilisateurImage;

    public void setRole(Role role) {
        this.role = role;
    }


    public void setUtilisateurImage(UtilisateurImage image) {
        this.utilisateurImage = image;
    }
}
