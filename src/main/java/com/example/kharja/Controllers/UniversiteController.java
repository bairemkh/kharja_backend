package com.example.kharja.Controllers;


import com.example.kharja.Entity.Universite;
import com.example.kharja.Services.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/Universite")
public class UniversiteController {

    @Autowired
    UniversiteService universiteService;

    @GetMapping("/getAll")
    public List<Universite> getAll(){
        return universiteService.retrieveAllUniversite();
    }

    @PostMapping("/add")
    public Universite add(@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/update")
    public Universite update(@RequestBody Universite universite){
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        universiteService.removeUniversite(id);
    }

    @PutMapping("/assignToUniversity/{idUni}/{idDep}")
    public String assignToUniversity(@PathVariable("idUni") int idUni, @PathVariable("idDep") int idDep){
        universiteService.assignUniversiteToDepartement(idUni,idDep);
        return "changed success!!!!!!!!!!";
    }
}


