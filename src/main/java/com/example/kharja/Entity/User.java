package com.example.kharjabackend.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String name;
    String lastName;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE,orphanRemoval = true)
    Set<Rating> ratings;
}
