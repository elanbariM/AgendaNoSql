package com.example.vt_agenda.repositories;

import com.example.vt_agenda.entities.Salle;
import com.example.vt_agenda.entities.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Vt_agendaRepository extends MongoRepository<Seance,Integer> {




}
