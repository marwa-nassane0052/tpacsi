package com.example.tp2.médicament;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class medecineResponse {

    private String name;
    private  String description;
    private Integer price;
    private String img;
}
