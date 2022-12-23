package com.example.kharjabackend.Models;

import com.example.kharjabackend.Models.Enums.RatingCriteria;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Rating implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.REMOVE)
    Place place;
    @Id
    @ManyToOne(cascade = CascadeType.REMOVE)
    User user;
    @Enumerated(EnumType.STRING)
    RatingCriteria criteria;
    int rate;
    String opinion=null;

}
