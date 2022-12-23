package com.example.kharja.Services;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Etudiant;

import java.util.List;

public interface DepartementService  {
    List<Departement> retrieveAllDepartement();

    //Ajouter seulement
    Departement addDepartement (Departement e);

    Departement updateDepartement (Departement e);

    Departement retrieveDepartement(Integer idDepartement);

    void removeDepartement(Integer idDepartement);

    List<Etudiant>getEtudiantsByDepartement(Integer idDepartement);
}
