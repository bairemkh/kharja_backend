package com.example.kharja.Entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "image_data")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ImageData implements Serializable {
    @Id
    String id;
    String path;
    String name;

    public ImageData(String id,String path, String name) {
        this.path = path;
        this.name = name;
        this.id = id;
    }

}