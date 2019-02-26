package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="vt_agenda")
public class Professeur {
    int Id_professeur;
    String nom;
    String prenom;
    String departement;
    String email;
}
