package com.example.vt_agenda.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection="seance")
public class Seance {
    int Id_Seance;
    Enseignement enseignement;
    Date Datecreation;
    Date Date_debut;
    Date Date_fin;
    String Duree;
    Salle salle;
    Filiere filiere;
    Professeur professeur;

    public int getId_Seance() {
        return Id_Seance;
    }

    public void setId_Seance(int id_Seance) {
        Id_Seance = id_Seance;
    }

    public Enseignement getEnseignement() {
        return enseignement;
    }

    public void setEnseignement(Enseignement enseignement) {
        this.enseignement = enseignement;
    }

    public Date getDatecreation() {
        return Datecreation;
    }

    public void setDatecreation(Date datecreation) {
        Datecreation = datecreation;
    }

    public Date getDate_debut() {
        return Date_debut;
    }

    public void setDate_debut(Date date_debut) {
        Date_debut = date_debut;
    }

    public Date getDate_fin() {
        return Date_fin;
    }

    public void setDate_fin(Date date_fin) {
        Date_fin = date_fin;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String duree) {
        Duree = duree;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}
