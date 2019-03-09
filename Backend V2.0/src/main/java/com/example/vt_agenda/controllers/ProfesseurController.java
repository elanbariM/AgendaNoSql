package com.example.vt_agenda.controllers;

import com.example.vt_agenda.entities.Enseignement;
import com.example.vt_agenda.entities.Filiere;
import com.example.vt_agenda.entities.Professeur;
import com.example.vt_agenda.entities.Salle;
import com.example.vt_agenda.repositories.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class ProfesseurController {

    @Autowired
    ProfesseurRepository projetRepository;

    @PostMapping("/postProfesseur")
    public String postProfesseur(@RequestBody Professeur professeur){
         projetRepository.save(professeur);
        return "Professeur successfully...";
    }

    @GetMapping("/getProfesseur")
    public Iterable<Professeur> getProfesseur(){
        return projetRepository.findAll();
    }








}
