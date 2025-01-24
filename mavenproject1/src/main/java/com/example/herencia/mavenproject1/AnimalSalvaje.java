/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class AnimalSalvaje extends Animal {
    private String habitat;

    public AnimalSalvaje(String nombre, int edad, String habitat) {
        super(nombre, edad);
        this.habitat = habitat;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + " es un animal salvaje y hace sonidos fuertes.");
    }

    public String getHabitat() {
        return habitat;
    }
}

