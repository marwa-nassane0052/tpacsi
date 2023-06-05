package com.example.tp2.car;

import com.example.tp2.doctore.AddDoctoreResponse;
import com.example.tp2.doctore.doctore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class carService {
    private  final carinterface repository;
    public  carResponse add(carRequest request){
        var car=com.example.tp2.car.car.builder()
                .name(request.getName())
                .location(request.getLocation())
                .phonenumber(request.getPhonenumber())
                .build();
        repository.save(car);
        return carResponse.builder()
                .name(request.getName())
                .location(request.getLocation())
                .phonenumber(request.getPhonenumber())
                .build();
    }
    public List<carResponse> getAllcars() {
        List<car> cars = repository.findAll();
        return cars.stream()
                .map(d -> carResponse.builder()
                        .id(d.getId())
                        .name(d.getName())
                        .location(d.getLocation())
                        .phonenumber(d.getPhonenumber())
                        .build())
                .collect(Collectors.toList());
    }
}
