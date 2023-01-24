package com.example.kharja.Controllers;

import com.example.kharja.Entity.ImageData;
import com.example.kharja.Entity.Place;
import com.example.kharja.Entity.Restaurant;
import com.example.kharja.Services.PlaceService;
import com.example.kharja.Services.RestaurantService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@Tag(name ="Place")
@RestController
@RequestMapping("/Place")
public class PlaceController {
    @Autowired
    PlaceService service;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Place>> getPlaces(){
        return ResponseEntity.accepted().body(service.retrieveAll());
    }

    @PostMapping(value = "/uploadPlaceImages/{id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> uploadPlaceImages(@PathVariable int id,@RequestParam("images") List<MultipartFile> images){
        return ResponseEntity.accepted().body(service.uploadImages(id,images));
    }

}
