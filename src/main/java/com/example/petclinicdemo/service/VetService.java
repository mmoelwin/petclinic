package com.example.petclinicdemo.service;

import com.example.petclinicdemo.model.Vet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VetService {
    Vet create(Vet vet);
    Vet findById(long id);
    List<Vet> findAll();
    Vet searchVetLastName (String name);

}
