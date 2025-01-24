/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class Elefante extends AnimalSalvaje {
    private double tamañoColmillos;

    public Elefante(String nombre, int edad, String habitat, double tamañoColmillos) {
        super(nombre, edad, habitat); 
        this.tamañoColmillos = tamañoColmillos;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + ", colmillos de " + tamañoColmillos + " metros, está trompeteando.");
    }
}
