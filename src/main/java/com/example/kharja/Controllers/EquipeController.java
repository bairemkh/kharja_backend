package com.example.kharja.Controllers;

import com.example.kharja.Entity.Equipe;
import com.example.kharja.Services.EquipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Tag(name ="team" )
@RestController
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    EquipeService equipeService;

    @GetMapping("/getAll")
    public List<Equipe> getAllEquipe(){
        return equipeService.retrieveAllEquipe();
    }
    @Operation(description="add team")
    @PostMapping("/add")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }

    @PutMapping("/update")
    public Equipe updateEquipe(@RequestBody Equipe equipe){
        return equipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/delete/{idE}")
    public String deleteEquipe(@PathVariable int idE){
        try {
            equipeService.removeEquipe(idE);
            return "done";
        }catch(Exception e)
        {
            return "Failed";
        }
    }

}
