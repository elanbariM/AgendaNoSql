package com.example.vt_agenda.controllers;

import com.example.vt_agenda.entities.*;

import com.example.vt_agenda.repositories.Vt_agendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class vt_agendaController {

    @Autowired
    Vt_agendaRepository vt_agendaRepository;
    //private vt_agendaRepository repository;
    //private SalleRepository sallerepository;

//        @PostMapping("/placedOrderNow")
//    public String placeOrder(@RequestBody Seance seance){
//        repository.save(seance);
//
//            return "Order placed successfully...";
//    }

//    @GetMapping("/all")
//    public  Iterable<Salle> get(){
//        return repository.getSalle();
//        }


    @PostMapping("/postSeance")
    public String postSeance(@RequestBody Seance seance){
         vt_agendaRepository.save(seance);
        return "Seance placed successfully... ";
    }

    @GetMapping("/getSeance")
    public Iterable<Seance> getSeance(){
        return vt_agendaRepository.findAll();
    }

//    @GetMapping("/getSeance/{code_filiere}")
//    public List<Seance> getSeance(@RequestParam String name_filiere){
//        return vt_agendaRepository.findByFiliere(name_filiere);
//    }





}
