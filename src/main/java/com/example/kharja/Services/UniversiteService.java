package com.example.kharja.Services;
import com.example.kharja.Entity.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversite();

    //Ajouter seulement
    Universite addUniversite (Universite e);

    Universite updateUniversite (Universite e);

    Universite retrieveUniversite(Integer idUniversite);

    void removeUniversite(Integer idUniversite);
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
