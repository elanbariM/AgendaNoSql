package com.example.vt_agenda.repositories;

import com.example.vt_agenda.entities.Professeur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfesseurRepository extends MongoRepository<Professeur,String> {
}
