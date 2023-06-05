package com.example.tp2.car;

import com.example.tp2.doctore.AddDoctoreResponse;
import com.example.tp2.user.AuthRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class caeControle {
    public  final carService service;
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("add")
    public ResponseEntity<carResponse> add(
            @RequestBody carRequest request
    ){
        return ResponseEntity.ok(service.add(request));
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cars")
    public ResponseEntity<List<carResponse>> getAllcars() {
        List<carResponse> cars = service.getAllcars();
        return ResponseEntity.ok(cars);
    }
}
