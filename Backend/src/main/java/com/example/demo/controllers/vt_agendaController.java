package com.example.demo.controllers;

import com.example.demo.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.vt_agendaRepository;

import java.util.Date;
import java.util.List;

@RestController
public class vt_agendaController {

    @Autowired

    private vt_agendaRepository repository;

    @PostMapping("/placedOrderNow")
    public String placeOrder(@RequestBody Seance seance){
        repository.save(seance);
        return "Order placed successfully...";
    }

    @GetMapping("/getSeanceByDatecreation/{date_creation}")
    public List<Seance> getSeanceBase(@PathVariable Date date_creation ){
        return repository.findByDatecreation(date_creation);

    }
}
