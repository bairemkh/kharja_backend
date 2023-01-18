package com.example.kharja.Entity;


import com.example.kharja.Entity.Enums.Location;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table( name = "Place" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="Type", discriminatorType = DiscriminatorType.STRING )
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    Location location;
    String description;
    int budget;
    @OneToMany(mappedBy = "place",cascade = CascadeType.REMOVE,orphanRemoval = true)
    Set<Rating> ratings;
    @OneToMany(cascade = CascadeType.REMOVE,orphanRemoval = true)
    Set<ImageData> MenuImages;
    @OneToMany(cascade = CascadeType.REMOVE,orphanRemoval = true)
    Set<ImageData> PlaceImages;
}
