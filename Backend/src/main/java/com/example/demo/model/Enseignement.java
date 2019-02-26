package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection="vt_agenda")

public class Enseignement {
    private int Id_enseignement;
    private String nom;
    private String code_enseigement;
    private String type_enseignement;


}
