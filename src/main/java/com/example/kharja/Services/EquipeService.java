package com.example.kharja.Services;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Equipe;
import com.example.kharja.Entity.Etudiant;

import java.util.List;

public interface EquipeService {

    List<Equipe> retrieveAllEquipe();

    //Ajouter seulement
    Equipe addEquipe (Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe(Integer idEquipe);

    void removeEquipe(Integer idEquipe);
}
