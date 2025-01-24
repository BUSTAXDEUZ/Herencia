/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class Leon extends AnimalSalvaje {
    private boolean tieneMelena;

    
    public Leon(String nombre, int edad, String habitat, boolean tieneMelena) {
        super(nombre, edad, habitat); 
        this.tieneMelena = tieneMelena;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + ", tiene melena: " + tieneMelena + ", está rugiendo.");
    }
}
