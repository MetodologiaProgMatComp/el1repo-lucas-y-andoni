package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    Movable p1 = new MovablePoint(1,2,3,4);

    @Test
    void moveUp() {
        assertDoesNotThrow(()->p1.moveUp());
    }

    @Test
    void moveDown() {
        assertDoesNotThrow(()->p1.moveDown());
    }

    @Test
    void moveLeft() {
        assertDoesNotThrow(()->p1.moveLeft());
    }

    @Test
    void moveRight() {
        assertDoesNotThrow(()->p1.moveRight());
    }

    @Test
    void testToString() {
        assertEquals("(1,2), speed =(3,4)",p1.toString());
    }
}