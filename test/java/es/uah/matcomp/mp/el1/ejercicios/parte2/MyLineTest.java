package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    MyLine l1 = new MyLine(1,3,2,5);
    MyLine l2 = new MyLine(new MyPoint(5,5),new MyPoint(1,4));

    @Test
    void getBegin() {
        assertEquals(5,l2.getBegin().getX());
        assertEquals(5,l2.getBegin().getY());
    }

    @Test
    void getEnd() {
        assertEquals(2,l1.getEnd().getX());
        assertEquals(5,l1.getEnd().getY());
    }

    @Test
    void setEnd() {
        assertDoesNotThrow(()->l1.setEnd(new MyPoint(3,6)));
    }

    @Test
    void setBegin() {
        assertDoesNotThrow(()->l2.setBegin(new MyPoint(0,0)));
    }

    @Test
    void getBeginX() {
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(5,l2.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(1,l2.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(5,l1.getEndY());
    }

    @Test
    void setBeginX() {
        assertDoesNotThrow(()->l2.setBeginX(34));
    }

    @Test
    void setEndX() {
        assertDoesNotThrow(()->l2.setEndX(25));
    }

    @Test
    void setBeginY() {
        assertDoesNotThrow(()->l1.setBeginY(11));
    }

    @Test
    void setEndY() {
        assertDoesNotThrow(()->l1.setEndY(50));
    }

    @Test
    void getBeginXY() {
        assertEquals(1,l1.getBeginXY()[0]);
        assertEquals(3,l1.getBeginXY()[1]);
    }

    @Test
    void getEndXY() {
        assertEquals(1,l2.getEndXY()[0]);
        assertEquals(4,l2.getEndXY()[1]);
    }

    @Test
    void setEndXY() {
        assertDoesNotThrow(()->l1.setEndXY(3,0));
    }

    @Test
    void setBeginXY() {
        assertDoesNotThrow(()->l2.setBeginXY(7,3));
    }

    @Test
    void getLength() {
        assertEquals(sqrt((1-2)*(1-2)+(3-5)*(3-5)),l1.getLength());
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan2(4-5,1-5),l2.getGradient());
    }

    @Test
    void testToString() {
        assertEquals("MyLine[begin = (1,3), end = (2,5)]",l1.toString());
    }
}