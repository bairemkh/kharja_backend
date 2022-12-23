package com.example.kharjabackend.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "image_data")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ImageData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    int id;
    String path;
    String name;
}