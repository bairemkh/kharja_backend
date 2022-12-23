package com.example.kharja.Services;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Domain;
import com.example.kharja.Entity.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    //Ajouter seulement
    Etudiant addEtudiant (Etudiant e);

    //Ajouter et affecter
    Etudiant addAndAssignEtudiant (Etudiant e, Departement id );

    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    /********************SERVICE AVANCE********************************/
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer
            idEquipe);
}
