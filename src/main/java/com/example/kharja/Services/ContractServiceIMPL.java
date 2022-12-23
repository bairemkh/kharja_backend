package com.example.kharja.Services;

import com.example.kharja.Entity.Contrat;

import com.example.kharja.Entity.Etudiant;
import com.example.kharja.repository.ContratRepository;
import com.example.kharja.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class ContractServiceIMPL  implements  ContactService{
    @Autowired
    EtudiantRepository etudiaetudiantRepository;
    @Autowired
    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();

    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat addAndAssignContrat(Contrat c) {
        return null;
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        contratRepository.save(contrat);
        return contrat;
    }

    @Override
    public Contrat retrieveContrat(Integer id) {
        return contratRepository.findById(id).get();
    }

    @Override
    public void removeContrat(Integer id) {
        contratRepository.deleteById(id);

    }
    @Transactional
    @Override
    public Contrat affectContratToEtudiant(int id, String nomE, String prenomE) {
       List<Etudiant>  etudiant = etudiaetudiantRepository.findByFullName(nomE ,prenomE);
        System.out.println(etudiant);
       /* if (etudiant.getContrats().size()>=5){
            return null;
        }else {
            Contrat ce=contratRepository.findById(id).get();
       //     etudiant.getContrats().add(ce);
            ce.setEtudiants(etudiant);

            return ce ;
        }*/
        return null;

    }

    public Integer contractNbr(Date dateD,Date dateF){
        return contratRepository.nbContrat(dateD,dateF);
    }
}
