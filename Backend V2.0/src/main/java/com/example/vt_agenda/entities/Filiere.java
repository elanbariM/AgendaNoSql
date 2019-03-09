package com.example.vt_agenda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="filiere")
public class Filiere {
    String nom_filière;
    String code_filière;
    String Niveau;
    String departement;
    String UFR;
    String type;

}
