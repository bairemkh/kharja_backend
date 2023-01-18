package com.example.kharja.Entity;
import com.example.kharja.Entity.Enums.RatingCriteria;
import lombok.Data;

import javax.persistence.*;
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
