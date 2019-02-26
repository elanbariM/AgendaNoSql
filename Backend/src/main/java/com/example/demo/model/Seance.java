package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection="vt_agenda")
public class Seance {
    int Id_Seance;
    Enseignement enseignement;
    Date Datecreation;
    Date Date_debut;
    Date Date_fin;
    Date Duree;
    Salle Salle;
    Professeur professeurs;

}
