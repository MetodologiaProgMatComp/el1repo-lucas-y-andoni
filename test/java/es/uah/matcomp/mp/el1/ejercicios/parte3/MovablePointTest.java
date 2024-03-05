package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint j = new MovablePoint(1,1,1,1);
        assertEquals(1,j.getxSpeed());
    }

    @Test
    void setxSpeed() {
        MovablePoint j = new MovablePoint(1,1);
        assertDoesNotThrow(()->j.setxSpeed(12));
    }

    @Test
    void getySpeed() {
        MovablePoint j = new MovablePoint(1,1,1,1);
        assertEquals(1,j.getySpeed());
    }

    @Test
    void setySpeed() {
        MovablePoint j = new MovablePoint(1,1,1,1);
        assertDoesNotThrow(()->j.setySpeed(12));
    }

    @Test
    void setSpeed() {
        MovablePoint j = new MovablePoint();
        assertDoesNotThrow(()->j.setSpeed(2,2));
        j.getSpeed();
        j.move();
    }
    @Test
    void testToString() {
        MovablePoint j = new MovablePoint(1,1,1,1);
        assertEquals("(1.0, 1.0), speed=(1.0, 1.0)",j.toString());
    }
}