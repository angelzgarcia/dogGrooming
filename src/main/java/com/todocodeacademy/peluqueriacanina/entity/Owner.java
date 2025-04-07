package com.todocodeacademy.peluqueriacanina.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owners")
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String name;
    private String contact;
    
    public Owner() 
    {
        
    }
    
    public Owner(String name, String contact)
    {
        this.name = name;
        this.contact = contact;
    }

    public int getId() { return id; }

    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }

    public String getContact() { return contact; }
    
    public void setContact(String contact) { this.contact = contact; }

    @Override
    public String toString() 
    {
        return "Owner{" + "id=" + id + ", name=" + name + ", contact=" + contact + '}';
    }
    
}
