package com.example.tp2.médicament;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.tp2.médicament.medecineRepository;
import com.example.tp2.médicament.medecineResponse;
import com.example.tp2.médicament.medecineRequest;

@Service
@RequiredArgsConstructor
public class medecineService {
    private final medecineRepository repository;

    /*public medecineResponse AddMedecine(medecineRequest request){
        var medecine= com.example.tp2.médicament.medecine.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

    }*/
}
