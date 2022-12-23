package com.example.kharjabackend.Models;

import com.example.kharjabackend.Models.Enums.CoffeeShopStyle;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CoffeeShop")
public class CoffeeShop extends Place{
    @Enumerated(EnumType.STRING)
    @Column(name = "style")
    CoffeeShopStyle coffeeShopStyle;
    int reservationPrice;
    String bestSeller;
    boolean band;
    boolean chicha;
    boolean birthday;
    boolean date;
    String about=null;
}
