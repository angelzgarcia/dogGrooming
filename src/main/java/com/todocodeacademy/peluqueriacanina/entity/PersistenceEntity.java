package com.todocodeacademy.peluqueriacanina.entity;

import com.todocodeacademy.peluqueriacanina.controllers.PersistenceController;
import java.util.Map;

public class PersistenceEntity {

    PersistenceController persistenceController;
    
    public PersistenceEntity()
    {
        this.persistenceController = new PersistenceController();
    }
    
    // OWNER
    
    
    
    // PET
    public void storePet(Map<?, String> formData)
    {
        Owner owner = new Owner();
        Pet pet = new Pet();
        
        owner.setName(formData.get("ownerName"));
        owner.setContact(formData.get("ownerContact"));
        
        pet.setName(formData.get("petName"));
        pet.setRace(formData.get("petRace"));
        pet.setColor(formData.get("petColor"));
        pet.setIsAllergic("si".equalsIgnoreCase(formData.get("isAllergic")));
        pet.setIsSpecialAttention("si".equalsIgnoreCase(formData.get("isSpecialAttention")));
        pet.setObservations(formData.get("observations"));
        pet.setOwner(owner);
        
        persistenceController.storePet(owner, pet);
    }
    
}
