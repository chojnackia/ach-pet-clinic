package com.example.achpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SPECIALTIES")
@Getter
@Setter
public class Specialty extends BaseEntity {

    @Column(name = "DESCRIPTION")
    private String description;
}
