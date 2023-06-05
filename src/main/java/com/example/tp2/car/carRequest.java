package com.example.tp2.car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class carRequest {


    private String location;


    private String phonenumber;


    private String name;
}
