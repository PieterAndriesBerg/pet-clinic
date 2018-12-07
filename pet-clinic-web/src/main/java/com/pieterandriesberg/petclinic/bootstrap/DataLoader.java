package com.pieterandriesberg.petclinic.bootstrap;

import com.pieterandriesberg.petclinic.model.Owner;
import com.pieterandriesberg.petclinic.model.Vet;
import com.pieterandriesberg.petclinic.services.OwnerService;
import com.pieterandriesberg.petclinic.services.VetService;
import com.pieterandriesberg.petclinic.services.map.OwnerServiceMap;
import com.pieterandriesberg.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by pieterandries on 7-12-18
 **/
@Component //By making this a component this becomes a Spring Bean.
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
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Abe");
        owner2.setLastName("Exodus");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Rayman");
        vet1.setLastName("Cowell");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Simon");
        vet2.setLastName("Trannagan");

        vetService.save(vet2);

        System.out.println("Loaded Vets........");
    }
}
