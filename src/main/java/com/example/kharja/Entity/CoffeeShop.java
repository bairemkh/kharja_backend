package com.example.kharja.Entity;

import com.example.kharja.Entity.Enums.CoffeeShopStyle;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
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
