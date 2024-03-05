package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d = new Dog("Pepazo");

    @Test
    void greets() {
        assertDoesNotThrow(()->d.greets());
    }

    @Test
    void testGreets() {
        assertDoesNotThrow(()->d.greets(new Dog("yayeye")));
    }
}