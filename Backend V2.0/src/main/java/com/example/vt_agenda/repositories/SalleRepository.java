package com.example.vt_agenda.repositories;

import com.example.vt_agenda.entities.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository<Salle,String> {
}
