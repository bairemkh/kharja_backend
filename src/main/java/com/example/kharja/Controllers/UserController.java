package com.example.kharja.Controllers;

import com.example.kharja.Services.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Tag(name ="User")
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService service;
}
