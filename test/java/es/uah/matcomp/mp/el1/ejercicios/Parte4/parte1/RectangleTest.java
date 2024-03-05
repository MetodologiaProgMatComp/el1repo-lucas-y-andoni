package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Shape r1 = new Rectangle(){};
    Shape r2 = new Rectangle(7,3,"red",true){};
    Rectangle r3 = new Rectangle(10,2){};

    @Test
    void getArea() {
        assertEquals(21,r2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(20,r2.getPerimeter());
    }

    @Test
    void getLength() {
        assertEquals(2,r3.getLength());
    }

    @Test
    void setLength() {
        assertDoesNotThrow(()->r3.setLength(4542.98));
    }

    @Test
    void getWidth() {
        assertEquals(10,r3.getWidth());
    }

    @Test
    void setWidth() {
        assertDoesNotThrow(()->r3.setWidth(4542.54));
    }

    @Test
    void testToString() {
        assertEquals("Rectangle[Shape[color = red, filled = true]length=2.0,width=10.0]",r3.toString());
    }
}