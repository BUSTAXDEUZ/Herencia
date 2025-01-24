/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println(nombre + " está haciendo un sonido genérico.");
    }

    public String getInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años";
    }
}
