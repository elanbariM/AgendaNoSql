package com.example.vt_agenda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="salle")
public class Salle {
    String num_salle;
    String batiment;
    String nbr_personne;
}
