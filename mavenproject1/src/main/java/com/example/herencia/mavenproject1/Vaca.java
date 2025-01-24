/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */


public class Vaca extends Mamifero {
    private double cantidadLecheDiaria;

  
    public Vaca(String nombre, int edad, boolean tienePelo, double cantidadLecheDiaria) {
        super(nombre, edad, tienePelo); // Llama al constructor de Mamifero
        this.cantidadLecheDiaria = cantidadLecheDiaria;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getInformacion() + ", produce " + cantidadLecheDiaria + " litros de leche al día, está mugiendo.");
    }
}

