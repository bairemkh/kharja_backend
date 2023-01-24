package com.example.kharja.Entity;

import com.example.kharja.Entity.Enums.CoffeeShopStyle;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@DiscriminatorValue("Restaurant")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Restaurant extends Place {
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

}
