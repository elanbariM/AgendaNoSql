package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="vt_agenda")
public class Filiere {
    int Id_filiere;
    String nom_filière;
    String code_filière;
    String Niveau;
    String departement;
    String UFR;
    String type;

}
