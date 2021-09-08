package com.example.achpetclinic.bootstrap;

import com.example.achpetclinic.model.Owner;
import com.example.achpetclinic.model.Vet;
import com.example.achpetclinic.services.OwnerService;
import com.example.achpetclinic.services.VetService;
import com.example.achpetclinic.services.map.OwnerServiceMap;
import com.example.achpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michal");
        owner1.setLastName("Aniol");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Amadeusz");
        owner2.setLastName("Witczak");

        ownerService.save(owner1);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Małgorzata");
        vet1.setLastName("Foremniak");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Maciej");
        vet2.setLastName("Górny");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
