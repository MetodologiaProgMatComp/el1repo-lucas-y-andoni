package es.uah.matcomp.mp.el1.ejercicios.parte1;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals(1,j.getX(),1);
    }

    @Test
    void setX() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.setX(1.0f));
    }

    @Test
    void getY() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals(1,j.getY(),1);
    }

    @Test
    void setY() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.setY(1.0f));
    }

    @Test
    void getRadius() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals(1,j.getRadius(),1);
    }

    @Test
    void setRadius() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.setRadius(1));
    }

    @Test
    void getXDelta() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals(1.0f,j.getXDelta(),1.0f);
    }

    @Test
    void getYDelta() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals(1.0f,j.getYDelta(),1.0f);
    }

    @Test
    void setXDelta() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.setXDelta(1.1f));
    }

    @Test
    void setYDelta() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.setYDelta(1.1f));
    }

    @Test
    void move() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.move());
    }

    @Test
    void reflectHorizontal() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.reflectHorizontal());
    }

    @Test
    void reflectVertical() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertDoesNotThrow(()->j.reflectVertical());

    }

    @Test
    void testToString() {
        Ball j = new Ball(1.0f,1.0f,1,1.0f,1.0f);
        assertEquals("Ball[(" + 1.0f + "," + 1.0f + "), speed=(" + 1.0f + "," + 1.0f + ")]",j.toString(),"Se ha detectado un error");
    }
}