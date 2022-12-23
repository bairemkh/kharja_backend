package com.example.kharjabackend.Models;

import com.example.kharjabackend.Models.Enums.CoffeeShopStyle;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Restaurant")
public class Restaurant extends Place{
    @Enumerated(EnumType.STRING)
    @Column(name = "style")
    CoffeeShopStyle restaurantStyle;
    int reservationPrice;
    String bestSeller;
    boolean band;
    boolean glutenAllergyFriendly;
    boolean veganFriendly;
    boolean birthday;
    boolean date;
    String about=null;
}
