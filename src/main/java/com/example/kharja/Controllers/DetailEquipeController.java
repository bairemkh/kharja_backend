package com.example.kharja.Controllers;

import com.example.kharja.Entity.DetailEquipe;
import com.example.kharja.Services.DetailsEquipe;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="detail_equipe")
@RestController
@RequestMapping("/detailEquipe")

public class DetailEquipeController {
    @Autowired
    DetailsEquipe detailsEquipe;
    @GetMapping("/getAll")
    public List<DetailEquipe> getAll(){
        return detailsEquipe.retrieveAllEquipe();
    }
@Operation(description="add team")
    @PostMapping("/add")
    public DetailEquipe add(@RequestBody DetailEquipe detailEquipe){
        return detailsEquipe.addDetailEquipe(detailEquipe);
    }
    @Operation(description="update team")
    @PutMapping("/update")
    public DetailEquipe update(@RequestBody DetailEquipe detailEquipe){
        return detailsEquipe.updateEquipe(detailEquipe);
    }
    @Operation(description="delete team")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        detailsEquipe.removeDetailsEquipe(id);
    }

}
