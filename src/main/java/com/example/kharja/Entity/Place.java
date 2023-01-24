package com.example.kharja.Entity;


import com.example.kharja.Entity.Enums.Location;
import com.example.kharja.Entity.Enums.PlaceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table( name = "Place" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="discriminator", discriminatorType = DiscriminatorType.STRING )
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Enumerated(EnumType.STRING)
    PlaceType type;
    @Enumerated(EnumType.STRING)
    Location location;
    String description;
    int budget;
    @OneToMany(mappedBy = "place",cascade = CascadeType.REMOVE,orphanRemoval = true)
    @JsonIgnore
    Set<Rating> ratings;
    @OneToMany(cascade = CascadeType.REMOVE,orphanRemoval = true)
    @JsonIgnore
    Set<ImageData> MenuImages;
    @OneToMany(cascade = CascadeType.REMOVE,orphanRemoval = true)
    @JsonIgnore
    Set<ImageData> PlaceImages;
}
