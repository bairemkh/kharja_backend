package com.example.kharja;


import com.example.kharja.Services.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class KharjaApplication implements CommandLineRunner {
    @Resource
    FilesStorageService storageService;
    public static void main(String[] args) {
        SpringApplication.run(KharjaApplication.class, args);
    }
   @Override
    public void run(String... args) throws Exception {
        storageService.init();
    }
}
