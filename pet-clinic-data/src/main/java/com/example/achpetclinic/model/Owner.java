package com.example.achpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

    private String adrdress;

    private String city;

    private String telephone;

    private Set<Pet> pets = new HashSet<>();

    public String getAdrdress() {
        return adrdress;
    }

    public void setAdrdress(String adrdress) {
        this.adrdress = adrdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
