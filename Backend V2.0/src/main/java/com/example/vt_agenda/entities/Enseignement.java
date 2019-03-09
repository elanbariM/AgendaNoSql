package com.example.vt_agenda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="enseignement")
public class Enseignement {
    private String nom;
    private String code_enseigement;
    private String type_enseignement;


}
