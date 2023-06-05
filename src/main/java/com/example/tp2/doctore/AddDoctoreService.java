package com.example.tp2.doctore;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.tp2.doctore.doctoreRepository;
import com.example.tp2.doctore.AddDoctoreResponse;
import com.example.tp2.doctore.AddDoctoreRequest;
import  com.example.tp2.doctore.doctore;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AddDoctoreService {
    private final doctoreRepository repository;

    public AddDoctoreResponse addDoctore(AddDoctoreRequest request){
        var doctor= doctore.builder()
                .location(request.getLocation())
                .name(request.getName())
                .secondname(request.getSecondname())
                .speciality(request.getSpeciality())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .detail(request.getDetail())

                .build();
        repository.save(doctor);
        return AddDoctoreResponse.builder()
                .name(request.getName())
                .secondname(request.getSecondname())
                .location(request.getLocation())
                .speciality(request.getSpeciality())
                .phoneNumber(request.getPhoneNumber())
                .email(request.getEmail())
                .detail((request.getDetail()))
                .build();
    }

    public List<AddDoctoreResponse> getAllDoctors() {
        List<doctore> doctors = repository.findAll();
        return doctors.stream()
                .map(d -> AddDoctoreResponse.builder()
                        .id(d.getId())
                        .name(d.getName())
                        .secondname(d.getSecondname())
                        .location(d.getLocation())
                        .speciality(d.getSpeciality())
                        .phoneNumber(d.getPhoneNumber())
                        .email(d.getEmail())
                        .detail((d.getDetail()))
                        .build())
                .collect(Collectors.toList());
    }

    public  AddDoctoreResponse getDoctorById(@PathVariable int id){
        Optional<doctore> optionalDoctore = repository.findById(id);
        if (optionalDoctore.isPresent()){
            doctore doctor=optionalDoctore.get();
            return AddDoctoreResponse.builder()
                    .name(doctor.getName())
                    .secondname(doctor.getSecondname())
                    .location(doctor.getLocation())
                    .speciality(doctor.getSpeciality())
                    .phoneNumber(doctor.getPhoneNumber())
                    .email(doctor.getEmail())
                    .detail(doctor.getDetail())
                    .build();
        }else {
            throw new IllegalArgumentException("Doctor with ID " +id + " not found");
        }
    }

}


