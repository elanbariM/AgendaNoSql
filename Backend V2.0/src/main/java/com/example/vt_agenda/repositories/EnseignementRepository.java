package com.example.vt_agenda.repositories;

import com.example.vt_agenda.entities.Enseignement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnseignementRepository extends MongoRepository<Enseignement,String> {
}
