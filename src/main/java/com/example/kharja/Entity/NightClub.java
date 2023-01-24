package com.example.kharja.Entity;

import com.example.kharja.Entity.Enums.NightClubStyle;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@DiscriminatorValue("NightClub")
public class NightClub extends Place{
    @Enumerated(EnumType.STRING)
    @Column(name = "style")
    NightClubStyle nightClubStyle;
    boolean band;
    boolean alcohol;
    boolean birthday;

}
