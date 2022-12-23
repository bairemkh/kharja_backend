package com.example.kharja.Services;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Etudiant;
import com.example.kharja.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceIMPL  implements  DepartementService{
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public List<Departement> retrieveAllDepartement() {
        return  departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement e) {
      return   departementRepository.save(e);
    }

    @Override
    public Departement updateDepartement(Departement e) {
        departementRepository.save(e);
        return e;}

    @Override
    public Departement retrieveDepartement(Integer idDepartement) {
        return departementRepository.findById(idDepartement).get();
    }

    @Override
    public void removeDepartement(Integer idDepartement) {
        departementRepository.deleteById(idDepartement);
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
    List<Etudiant> etudiants=departementRepository.getStudentByDepart(idDepartement);
        System.out.println(etudiants);
        return etudiants;
    }
}
