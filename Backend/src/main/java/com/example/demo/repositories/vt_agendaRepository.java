package com.example.demo.repositories;

import com.example.demo.model.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface vt_agendaRepository extends MongoRepository<Seance,Integer> {
    List<Seance> findByDatecreation(Date Datecreation);

}
