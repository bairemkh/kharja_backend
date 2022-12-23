package com.example.kharja.Services;

import com.example.kharja.repository.ContratRepository;
import com.example.kharja.repository.DepartementRepository;
import com.example.kharja.repository.EquipeRepository;
import com.example.kharja.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EudiantServiceIMPL implements EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private DepartementRepository departementRepository;
    @Autowired
    EquipeRepository equipeRepository;
    @Autowired
    ContratRepository contratRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
    @Override
    public Etudiant addAndAssignEtudiant(Etudiant e, Departement id) {
        return null;
    }
    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }
    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {

        return etudiantRepository.findById(idEtudiant).get();
    }
    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
    @Transactional
    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {

     Etudiant etudiant =  retrieveEtudiant(etudiantId);
     etudiant.setDepartement(departementRepository.findById(departementId).get());
     updateEtudiant(etudiant);


    }
    @Transactional
    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Contrat contrat = contratRepository.findById(idContrat).get();
        //Set<Equipe> equipes=new HashSet<Equipe>();
       // e.setEquipes(equipes);
        try {
          //  e.getEquipes().add(equipe);
            equipe.getEtudiants().add(e);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        contrat.setEtudiants(e);
       // e.setContrat(contrat);
        addEtudiant(e);
        return e;
    }

    public List<Etudiant> getStudentByDep(Integer depid){
        return departementRepository.getStudentByDepart(depid);
    }
}
