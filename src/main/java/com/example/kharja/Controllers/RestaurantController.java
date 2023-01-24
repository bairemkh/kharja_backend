package com.example.kharja.Controllers;

import com.example.kharja.Entity.Enums.PlaceType;
import com.example.kharja.Entity.ImageData;
import com.example.kharja.Entity.Place;
import com.example.kharja.Entity.Restaurant;
import com.example.kharja.Entity.User;
import com.example.kharja.Services.RestaurantService;
import com.example.kharja.Services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.util.List;

@Controller
@Tag(name ="Restaurant")
@RestController
@RequestMapping("/Restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService service;


    @PostMapping(value = "/add")
    public ResponseEntity<Object> addResto(@RequestBody Restaurant r){
        try {
            r.setType(PlaceType.Restaurant);
            return ResponseEntity.accepted().body(service.add(r));
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e);
        }

    }
}
