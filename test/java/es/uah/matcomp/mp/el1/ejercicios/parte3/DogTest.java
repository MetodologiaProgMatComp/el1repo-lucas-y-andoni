package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog j = new Dog("Josemi");
        assertDoesNotThrow(()->j.greets());
    }

    @Test
    void testGreets() {
        Dog j = new Dog("Josemi");
        assertDoesNotThrow(()->j.greets(j));
    }

    @Test
    void testToString() {
        Dog j = new Dog("Josemi");
        assertEquals("Dog[Mammal[Animal[name= Josemi]]]",j.toString());
    }
}