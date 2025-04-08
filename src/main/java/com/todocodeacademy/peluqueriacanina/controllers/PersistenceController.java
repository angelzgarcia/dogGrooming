package com.todocodeacademy.peluqueriacanina.controllers;

import com.todocodeacademy.peluqueriacanina.entity.Owner;
import com.todocodeacademy.peluqueriacanina.entity.Pet;
import java.util.Map;

public class PersistenceController {

    OwnerJpaController ownerJpaController;
    PetJpaController petJpaController;
    
    public PersistenceController()
    {
        this.ownerJpaController = new OwnerJpaController();  
        this.petJpaController = new PetJpaController(); 
    }
    
    // OWNER
    
    
    
    // PET
    public void storePet(Owner owner, Pet pet)
    {        
        this.ownerJpaController.create(owner);
        this.petJpaController.create(pet);
    }
    
}
