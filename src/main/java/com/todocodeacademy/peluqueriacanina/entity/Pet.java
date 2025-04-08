package com.todocodeacademy.peluqueriacanina.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pets")
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String name;
    private String race;
    private String color;
    private boolean isAllergic;
    private boolean isSpecialAttention;
    private String observations;
    
    @OneToOne
    private Owner owner;
    
    public Pet() 
    {
        
    }
    
    public Pet(String name, String race, String color, boolean isAllergic, boolean isSpecialAttention, String observations, Owner owner)
    {
        this.name = name;
        this.race = race;
        this.color = color;
        this.isAllergic = isAllergic;
        this.isSpecialAttention = isSpecialAttention;
        this.observations = observations;
        this.owner = owner;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getRace() { return race; }

    public void setRace(String race) { this.race = race; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public boolean isAllergic() { return isAllergic; }

    public void setIsAllergic(boolean isAllergic) { this.isAllergic = isAllergic; }

    public boolean isIsSpecialAttention() { return isSpecialAttention; }

    public void setIsSpecialAttention(boolean isSpecialAttention) { this.isSpecialAttention = isSpecialAttention; }

    public String getObservations() { return observations; }

    public void setObservations(String observations) { this.observations = observations; }

    public Owner getOwner() { return owner; }

    public void setOwner(Owner owner) { this.owner = owner; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pet{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", race=").append(race);
        sb.append(", color=").append(color);
        sb.append(", isAllergic=").append(isAllergic);
        sb.append(", isSpecialAttention=").append(isSpecialAttention);
        sb.append(", observations=").append(observations);
        sb.append(", owner=").append(owner);
        sb.append('}');
        return sb.toString();
    }
    
}
