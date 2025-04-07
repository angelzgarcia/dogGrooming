package com.todocodeacademy.peluqueriacanina;

import com.todocodeacademy.peluqueriacanina.gui.AddPetForm;
import com.todocodeacademy.peluqueriacanina.gui.Home;

public class Peluqueriacanina {

    public static void main(String[] args) {
        
        Home home = new Home();
        // AddPetForm home = new AddPetForm();
        home.setVisible(true);  
        home.setLocationRelativeTo(null);
        
    }
}
