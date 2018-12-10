package com.pieterandriesberg.petclinic.bootstrap;

import com.pieterandriesberg.petclinic.model.Owner;
import com.pieterandriesberg.petclinic.model.Vet;
import com.pieterandriesberg.petclinic.services.OwnerService;
import com.pieterandriesberg.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by pieterandries on 7-12-18
 **/
@Component //By making this a component this becomes a Spring Bean.
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
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Abe");
        owner2.setLastName("Exodus");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rayman");
        vet1.setLastName("Cowell");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Simon");
        vet2.setLastName("Trannagan");

        vetService.save(vet2);

        System.out.println("Loaded Vets........");
    }
}
