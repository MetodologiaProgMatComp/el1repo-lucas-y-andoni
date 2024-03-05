package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle(3,"green",false);
    Circle c2 = new Circle(5);
    Shape c3 = new Circle();

    @Test
    void getArea() {
        assertEquals(3*3*Math.PI,c1.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(2*3*Math.PI,c1.getPerimeter());
    }

    @Test
    void getRadius() {
        assertEquals(5,c2.getRadius());
    }

    @Test
    void setRadius() {
        assertDoesNotThrow(()->c1.setRadius(324));
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape[color = green, filled = false]radius=3.0]",c1.toString());
    }
}