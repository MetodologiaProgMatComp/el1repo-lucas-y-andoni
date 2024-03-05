package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Shape s1 = new Square(){};
    Shape s2 = new Square(3){};
    Square s3 = new Square(6,"blue",false){};

    @Test
    void getArea() {
        assertEquals(3*3,s2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals((3+3)*2,s2.getPerimeter());
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->s3.setWidth(2.9));
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->s3.setLength(6.78));
    }

    @Test
    void testToString() {
        assertEquals("Square"+new Rectangle(6,6,"blue",false).toString()+"]",s3.toString());
    }

    @Test
    void getSide() {
        assertEquals(6,s3.getSide());
    }

    @Test
    void setSide() {
        assertDoesNotThrow(()->s3.setSide(2.45));
    }
}