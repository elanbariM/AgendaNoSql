package com.example.vt_agenda.controllers;

import com.example.vt_agenda.entities.Salle;
import com.example.vt_agenda.repositories.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SalleController {

    @Autowired
    SalleRepository salleRepository;

    @PostMapping("/postSalle")
    public String postSalle(@RequestBody Salle salle){
         salleRepository.save(salle);
        return "Salle placed successfully...";
    }

    @GetMapping("/getSalle")
    public List<Salle> getSalle(){
        return salleRepository.findAll();
    }

}
