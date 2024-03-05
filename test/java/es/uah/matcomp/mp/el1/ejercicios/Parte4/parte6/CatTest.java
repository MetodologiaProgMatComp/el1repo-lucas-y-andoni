package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c = new Cat("Dalaola");

    @Test
    void greets() {
        assertDoesNotThrow(()->c.greets());
    }
}