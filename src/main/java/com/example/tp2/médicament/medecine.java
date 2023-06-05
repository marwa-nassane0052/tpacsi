package com.example.tp2.médicament;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="medecine")
public class medecine {
    @Id
    @GeneratedValue
    private Integer idMedecine;

    @Column
    @Nonnull
    private String name;

    @Column
    @Nonnull
    private  String description;

    @Column
    @Nonnull
    private Integer price;

    @Column
    @Nonnull
    private String img;

}
