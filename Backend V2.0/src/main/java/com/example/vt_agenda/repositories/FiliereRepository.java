package com.example.vt_agenda.repositories;

import com.example.vt_agenda.entities.Filiere;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FiliereRepository extends MongoRepository<Filiere, String> {

  //  Iterable<Filiere> findByCodefilière(@Param("code_filiere") String code_filiere);
}
