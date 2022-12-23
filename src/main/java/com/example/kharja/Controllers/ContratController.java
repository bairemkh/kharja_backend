package com.example.kharja.Controllers;

import com.example.kharja.Entity.Contrat;
import com.example.kharja.Entity.DetailEquipe;
import com.example.kharja.Services.ContractServiceIMPL;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Tag(name ="contrat")
@RestController
@RequestMapping("/contrat")

public class ContratController {
@Autowired
    ContractServiceIMPL  contractServiceIMPL;
    @GetMapping("/getAll")
    public List<Contrat> getAll(){
            return contractServiceIMPL.retrieveAllContrats();
        }
        @Operation(description="add contrat")
        @PostMapping("/add")
        public Contrat add(@RequestBody Contrat contrat){
            return contractServiceIMPL.addContrat(contrat);
        }
        @Operation(description="update contrat")
        @PutMapping("/update")
        public Contrat update(@RequestBody Contrat contrat){
            return contractServiceIMPL.updateContrat(contrat);
        }
        @Operation(description="delete contrat")
        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable int id){
            contractServiceIMPL.removeContrat(id);
        }


         @Operation(description="assign contract")
         @PostMapping("/Assign/{id}/{name}/{lastname}")
        public Contrat assign( @PathVariable int id , @PathVariable String name,@PathVariable String lastname){
         return  contractServiceIMPL.affectContratToEtudiant(id,name,lastname);
         }

        /* @Operation(description="contrat nbr")
        @GetMapping("/contractsNumber/{dateDebut}/dateFin}")
        public Integer nbrContracts(){
     //   return contractServiceIMPL.contractNbr(@PathVariable("dateDebut") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dated);

    } */

    }

