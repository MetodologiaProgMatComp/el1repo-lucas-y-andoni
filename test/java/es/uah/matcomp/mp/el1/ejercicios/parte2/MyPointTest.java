package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint p1 = new MyPoint(2,3);

    @Test
    void getX() {
        assertEquals(2,p1.getX());
    }

    @Test
    void setX() {
        assertDoesNotThrow(()->p1.setX(43));
    }

    @Test
    void getY() {
        assertEquals(3,p1.getY());
    }

    @Test
    void setY() {
        assertDoesNotThrow(()->p1.setY(2));
    }

    @Test
    void getXY() {
        assertEquals(2,p1.getXY()[0]);
        assertEquals(3,p1.getXY()[1]);
    }

    @Test
    void setXY() {
        assertDoesNotThrow(()->p1.setXY(0,7));
    }

    @Test
    void testToString() {
        assertEquals("("+2+","+3+")",p1.toString());
    }

    @Test
    void distance() {
        assertEquals(sqrt((2-5)*(2-5)+(3-6)*(3-6)),p1.distance(5,6));
    }

    @Test
    void testDistance() {
        MyPoint p2 = new MyPoint(5,1);
        assertEquals(sqrt((p2.getX()-2)*(p2.getX()-2)+(p2.getY()-3)*(p2.getY()-3)),p1.distance(p2));
    }

    @Test
    void testDistance1() {
        assertEquals(sqrt(2*2+3*3),p1.distance());
    }
}