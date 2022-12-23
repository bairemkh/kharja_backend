package com.example.kharjabackend.Models;

import com.example.kharjabackend.Models.Enums.NightClubStyle;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

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
