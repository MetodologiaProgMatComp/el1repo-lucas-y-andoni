package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal j = new Animal("pepe");
        assertEquals("Animal[name= pepe]",j.toString());
    }
}