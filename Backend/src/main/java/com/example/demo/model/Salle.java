package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="vt_agenda")
public class Salle {
    int Id_salle;
    String num_salle;
    String batiment;
    String nbr_personne;
}
