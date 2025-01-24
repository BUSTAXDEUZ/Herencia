/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class Perro extends Mamifero {
    private String raza;

    
    public Perro(String nombre, int edad, boolean tienePelo, String raza) {
        super(nombre, edad, tienePelo); 
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + ", raza: " + raza + ", está ladrando.");
    }

    public void moverCola() {
        System.out.println(getInformacion() + " está moviendo la cola.");
    }
}
