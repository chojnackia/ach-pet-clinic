package com.example.achpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "VISITS")
@Getter
@Setter
public class Visit extends BaseEntity {
    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "DESCRIPTION")
    private String Description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
