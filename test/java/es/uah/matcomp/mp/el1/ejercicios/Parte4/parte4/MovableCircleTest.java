package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    Movable c1 = new MovableCircle(1,2,-1,4,4);

    @Test
    void moveUp() {
        assertDoesNotThrow(()->c1.moveUp());
    }

    @Test
    void moveDown() {
        assertDoesNotThrow(()->c1.moveDown());
    }

    @Test
    void moveLeft() {
        assertDoesNotThrow(()->c1.moveLeft());
    }

    @Test
    void moveRight() {
        assertDoesNotThrow(()->c1.moveRight());
    }

    @Test
    void testToString() {
        assertEquals("(1,2), speed =(-1,4), radius= 4",c1.toString());
    }
}