package com.example.kharja.Controllers;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Etudiant;
import com.example.kharja.Services.EudiantServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    EudiantServiceIMPL etudiantService;


    @GetMapping("/getAllE")
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/AddEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.updateEtudiant(etudiant);
    }
    @DeleteMapping("/deleteE/{id}")
    public String removeEtudiant(@PathVariable("id") int idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);
        return "delete success";
    }
/***********SERVICE AVANCE******************************/
    @PutMapping("/assignToDepartement/{idStu}/{idDep}")
    public String assignToDepartement(@PathVariable("idStu") int idStu, @PathVariable("idDep") int idDep){

        etudiantService.assignEtudiantToDepartement(idStu,idDep);
        return "changed success!!!!!!!!!!";
    }
    @PostMapping("/addAndAssign/{idEqu}/{idCon}")
    public Etudiant addAndAssign(@RequestBody Etudiant etudiant,@PathVariable("idEqu") int idEqu,@PathVariable("idCon")int idCon){
        etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant,idCon,idEqu);
        return etudiant;
    }
    @GetMapping("/etudiant/etudiant-dep/{depid}")
    public List<Etudiant> getEtudiantByDep(@PathVariable("depid") Integer depid){
        return etudiantService.getStudentByDep(depid);
    }
}