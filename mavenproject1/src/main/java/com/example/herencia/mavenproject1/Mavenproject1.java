/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.herencia.mavenproject1;

/**
 *
 * @author Fabia
 */
public class Mavenproject1 {
    public static void main(String[] args) {
        Animal generico = new Animal("Animal Genérico", 5);
        generico.emitirSonido();

        Mamifero mamifero = new Mamifero("Mamífero", 3, true);
        mamifero.emitirSonido();

        Perro perro = new Perro("Rex", 4, true, "Labrador");
        perro.emitirSonido();
        perro.moverCola();

        Vaca vaca = new Vaca("Lola", 6, true, 10.5);
        vaca.emitirSonido();

        AnimalSalvaje animalSalvaje = new AnimalSalvaje("Cocodrilo", 8, "Pantanos");
        animalSalvaje.emitirSonido();

        Elefante elefante = new Elefante("Dumbo", 10, "Sabana", 2.5);
        elefante.emitirSonido();

        Leon leon = new Leon("Simba", 7, "Selva", true);
        leon.emitirSonido();
    }
}

