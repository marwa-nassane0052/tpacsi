package com.example.tp2.doctore;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AddDoctoreControle {
    private  final  AddDoctoreService service;
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/adddoctore")
    public ResponseEntity<AddDoctoreResponse> addDoctore(
            @RequestBody AddDoctoreRequest request
    ){
        return ResponseEntity.ok(service.addDoctore(request));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/doctors")
    public ResponseEntity<List<AddDoctoreResponse>> getAllDoctors() {
        List<AddDoctoreResponse> doctors = service.getAllDoctors();
        return ResponseEntity.ok(doctors);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/doctore/{id}")
    public ResponseEntity<AddDoctoreResponse> getDoctoreById(@PathVariable int id){
        AddDoctoreResponse doctor =service.getDoctorById(id);
        return ResponseEntity.ok(doctor);

    }
}
