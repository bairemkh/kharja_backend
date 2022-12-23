package com.example.kharja.Services;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Etudiant;
import com.example.kharja.Entity.Universite;
import com.example.kharja.repository.DepartementRepository;
import com.example.kharja.repository.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversiteServiceIMPL implements UniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;
    @Autowired
    DepartementRepository departementRepository;

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
    @Transactional
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {

        Universite universite =  retrieveUniversite(idUniversite);
        universite.getDepartements().add(departementRepository.findById(idDepartement).get());

    }
}
