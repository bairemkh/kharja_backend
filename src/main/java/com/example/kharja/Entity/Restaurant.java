package com.example.kharja.Entity;

import com.example.kharja.Entity.Enums.CoffeeShopStyle;

import javax.persistence.*;

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
