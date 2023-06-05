package com.example.tp2.car;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="car")
public class car {
    @GeneratedValue
    @Id
    private  int id;

    @Column
    @Nonnull
    private String location;

    @Column
    @Nonnull
    private String phonenumber;

    @Column
    @Nonnull
    private String name;

}
