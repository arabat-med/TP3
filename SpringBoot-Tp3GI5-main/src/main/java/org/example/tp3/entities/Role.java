package org.example.tp3.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<Utilisateur> utilisateurs;


}
