package com.example.petclinicdemo.service;

import com.example.petclinicdemo.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner create(Owner owner);
    Owner findById(long id);
    List<Owner> findAll();
}
