package com.example.vt_agenda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="professeur")
public class Professeur {
    String nom;
    String prenom;
    String departement;
    String email;
}
