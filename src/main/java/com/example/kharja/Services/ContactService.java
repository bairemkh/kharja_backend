package com.example.kharja.Services;

import com.example.kharja.Entity.Contrat;
import com.example.kharja.Entity.Etudiant;

import java.util.List;

public interface ContactService {

    List<Contrat> retrieveAllContrats();

    //Ajouter seulement
    Contrat addContrat (Contrat e);

    //Ajouter et affecter
    Contrat addAndAssignContrat (Contrat c);

    Contrat updateContrat (Contrat contrat);

    Contrat retrieveContrat(Integer id);

    void removeContrat(Integer id);
    Contrat affectContratToEtudiant (int ce, String nomE , String prenomE);

}
