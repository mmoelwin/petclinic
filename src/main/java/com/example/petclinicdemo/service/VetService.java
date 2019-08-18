package com.example.petclinicdemo.service;

import com.example.petclinicdemo.model.Vet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VetService {
    public Vet create(Vet vet);
    public Vet findById(long id);
    public List<Vet> findAll();


}
