package com.example.vt_agenda.controllers;

import com.example.vt_agenda.entities.Enseignement;
import com.example.vt_agenda.repositories.EnseignementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class EnseignementController {

    @Autowired
    EnseignementRepository enseignementRepository;

    @PostMapping("/postEnseignement")
    public String postEnseignement(@RequestBody Enseignement enseignement){
         enseignementRepository.save(enseignement);
        return "Enseignement successfully...";
    }

    @GetMapping("/getEnseignement")
    public Iterable<Enseignement> getEnseignement(){
        return enseignementRepository.findAll();
    }

}
