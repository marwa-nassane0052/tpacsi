package com.example.tp2.médicament;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class medecineRequest {

    private Integer idMedecine;
    private String name;
    private  String description;
    private Integer price;
    private String img;
}
