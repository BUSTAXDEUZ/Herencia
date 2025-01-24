/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class Mamifero extends Animal {
    private boolean tienePelo;

 
    public Mamifero(String nombre, int edad, boolean tienePelo) {
        super(nombre, edad); 
        this.tienePelo = tienePelo;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + " es un mamífero y hace sonidos específicos.");
    }

    public boolean tienePelo() {
        return tienePelo;
    }
}
