package com.todocodeacademy.peluqueriacanina.entity;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "owners")
public class Owner implements Serializable {
    
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", contact=").append(contact);
        sb.append('}');
        return sb.toString();
    }

}
