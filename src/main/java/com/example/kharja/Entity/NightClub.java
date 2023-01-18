package com.example.kharja.Entity;

import com.example.kharja.Entity.Enums.NightClubStyle;

import javax.persistence.*;

@Entity
@DiscriminatorValue("NightClub")
public class NightClub extends Place{
    @Enumerated(EnumType.STRING)
    @Column(name = "style")
    NightClubStyle nightClubStyle;
    boolean band;
    boolean alcohol;
    boolean birthday;
}
