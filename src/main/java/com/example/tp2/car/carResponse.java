package com.example.tp2.car;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class carResponse {
    private  int id;


    private String location;


    private String phonenumber;


    private String name;
}
