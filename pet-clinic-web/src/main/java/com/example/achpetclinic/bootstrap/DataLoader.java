package com.example.achpetclinic.bootstrap;

import com.example.achpetclinic.model.Owner;
import com.example.achpetclinic.model.Vet;
import com.example.achpetclinic.services.OwnerService;
import com.example.achpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michal");
        owner1.setLastName("Aniol");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Amadeusz");
        owner2.setLastName("Witczak");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Malgorzata");
        vet1.setLastName("Foremniak");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Maciej");
        vet2.setLastName("Gorny");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
