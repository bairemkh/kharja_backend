package com.example.kharja.Controllers;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.DetailEquipe;
import com.example.kharja.Entity.Etudiant;
import com.example.kharja.Services.DepartementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@Tag(name ="departement")
@RestController
@RequestMapping("/departement")
public class DepartementController {
    @Autowired
    DepartementService departementService;

    @GetMapping("/getAll")
    public List<Departement> getAll(){
        return departementService.retrieveAllDepartement();
    }
    @Operation(description="add dep")
    @PostMapping("/add")
    public Departement add(@RequestBody Departement departement){
        return departementService.addDepartement(departement);

    }
    @Operation(description="update dep")
    @PutMapping("/update")
    public Departement update(@RequestBody Departement departement){
        return departementService.updateDepartement(departement);
    }
    @Operation(description="delete dep")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
    departementService.removeDepartement(id);
    }

   /* @Operation(description="get students by dept")
    @GetMapping("/getStudents/{id}")
    public List<Etudiant> getbyDept(@PathVariable int id){
        return  departementService.getEtudiantsByDepartement(id);

    }*/
}
