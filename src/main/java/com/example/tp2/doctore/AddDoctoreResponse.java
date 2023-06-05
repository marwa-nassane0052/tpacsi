package com.example.tp2.doctore;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddDoctoreResponse {
    private Integer id;
    private  String name;
    private String secondname;
    private  String speciality;
    private  String location;

    private  String phoneNumber;
    private String detail;
    private String email;

}
