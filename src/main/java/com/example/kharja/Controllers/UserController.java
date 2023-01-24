package com.example.kharja.Controllers;

import com.example.kharja.Entity.User;
import com.example.kharja.Services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Tag(name ="User")
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping(value = "/uploadImage",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public User uploadImage(@RequestParam("images") List<MultipartFile> multipartFile, @RequestBody User user){
     return  service.add(user);
    }
}
