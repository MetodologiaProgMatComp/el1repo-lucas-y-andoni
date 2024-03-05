package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    BigDog bG = new BigDog("fafaf");

    @Test
    void greets() {
        assertDoesNotThrow(()->bG.greets());
    }

    @Test
    void testGreets() {
        assertDoesNotThrow(()->bG.greets(new Dog("alalal")));
    }

    @Test
    void testGreets1() {
        assertDoesNotThrow(()->bG.greets(new BigDog("leeoasodlf")));
    }
}