package com.example.achpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TYPES")
@Getter
@Setter
public class PetType extends BaseEntity {

    @Column(name = "NAME")
    private String name;
}
