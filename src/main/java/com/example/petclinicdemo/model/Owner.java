package com.example.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
//@Data
public class Owner extends Person{

    private String address;
    private String ciry;
    private String telephone;

    public Owner(){

    }

    public Owner(String firstName, String lastName, String address, String ciry, String telephone) {
        super(firstName, lastName);
        this.address = address;
        this.ciry = ciry;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCiry() {
        return ciry;
    }

    public void setCiry(String ciry) {
        this.ciry = ciry;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
