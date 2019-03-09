package com.example.vt_agenda.controllers;

import com.example.vt_agenda.entities.Filiere;
import com.example.vt_agenda.repositories.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class FiliereController {

    @Autowired
    FiliereRepository filiereRepository;

    @PostMapping("/postFiliere")
    public String postFiliere(@RequestBody Filiere filiere){
         filiereRepository.save(filiere);
        return "Filiere successfully...";
    }



}
