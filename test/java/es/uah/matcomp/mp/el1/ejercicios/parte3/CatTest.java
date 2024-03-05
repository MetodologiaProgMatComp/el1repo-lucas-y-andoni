package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat j = new Cat("josefina");
        assertDoesNotThrow(()->j.greets());
    }

    @Test
    void testToString() {
        Cat g = new Cat("pepa");
        assertEquals("Cat[Mammal[Animal[name= pepa]]]",g.toString());
    }
}