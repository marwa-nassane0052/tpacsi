package com.example.tp2.doctore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "doctors")
public class doctore {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    @Nonnull
    private String name;

    @Column
    @Nonnull
    private String secondname;

    @Column
    @Nonnull
    private String speciality;

    @Column
    @Nonnull
    private  String location;

    @Column
    @Nonnull
    private String phoneNumber;

    @Column(unique = true)
    @Nonnull
    private String email;

    @Column
    @Nonnull
    private String detail;
}
