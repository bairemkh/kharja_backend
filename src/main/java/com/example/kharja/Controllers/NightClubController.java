package com.example.kharja.Controllers;

import com.example.kharja.Entity.Enums.PlaceType;
import com.example.kharja.Entity.ImageData;
import com.example.kharja.Entity.NightClub;
import com.example.kharja.Services.NightClubService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@Tag(name ="NightClub")
@RestController
@RequestMapping("/NightClub")
public class NightClubController {
    @Autowired
    NightClubService service;


    @PostMapping(value = "/add")
    public ResponseEntity<Object> addNightClub(@RequestBody NightClub r){
        try {
            r.setType(PlaceType.NightClub);
            return ResponseEntity.accepted().body(service.add(r));
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e);
        }

    }
}
