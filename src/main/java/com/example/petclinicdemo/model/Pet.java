package com.example.petclinicdemo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
//@Data
public class Pet extends NameEntity{
    @Enumerated(EnumType.STRING)
    private PetType petType;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfBirth;
    @ManyToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String name, PetType petType, LocalDate dateOfBirth) {
        super(name);
        this.petType = petType;
        this.dateOfBirth = dateOfBirth;

    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
