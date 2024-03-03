package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyCircle c1 = new MyCircle();
    MyCircle c2 = new MyCircle(0,0,5);
    MyCircle c3 = new MyCircle(new MyPoint(2,6),3);

    @Test
    void getRadius() {
        assertEquals(5,c2.getRadius());
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c1.setRadius(56));
    }

    @Test
    void getCenter() {
        assertEquals(2,c3.getCenter().getX());
        assertEquals(6,c3.getCenter().getY());
    }

    @Test
    void setCenter() {
        assertDoesNotThrow(()->c2.setCenter(new MyPoint(34,65)));
    }

    @Test
    void getCenterX() {
        assertEquals(0,c2.getCenterX());
    }

    @Test
    void getCenterY() {
        assertEquals(0,c2.getCenterY());
    }

    @Test
    void getCenterXY() {
        assertEquals(2,c3.getCenterXY()[0]);
        assertEquals(6,c3.getCenterXY()[1]);
    }

    @Test
    void setCenterX() {
        assertDoesNotThrow(()->c2.setCenterX(34));
    }

    @Test
    void setCenterY() {
        assertDoesNotThrow(()->c2.setCenterY(20));
    }

    @Test
    void setCenterXY() {
        assertDoesNotThrow(()->c3.setCenterXY(43,23));
    }

    @Test
    void testToString() {
        assertEquals("MyCircle[radius= 5, center="+c2.getCenter().toString()+"]",c2.toString());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*5*5,c2.getArea());
    }

    @Test
    void getCircumference() {
        assertEquals(Math.PI*2*3,c3.getCircumference());
    }

    @Test
    void distance() {
        assertEquals(c2.getCenter().distance(c3.getCenter()),c2.distance(c3));
    }
}