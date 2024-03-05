package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle j = new Circle(1);
        assertEquals(1,j.getRadius());
    }

    @Test
    void setRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(()->j.setRadius(2));
    }

    @Test
    void getArea() {
        Circle j = new Circle(1,"rojo",false);
        assertEquals(Math.PI,j.getArea());
    }

    @Test
    void getPerimeter() {
        Circle j = new Circle(1);
        assertEquals(Math.PI*2,j.getPerimeter());
    }

    @Test
    void testToString() {
        Circle j = new Circle(1);
        assertEquals("CircleShape[color= red, filled= true], radius1.0]",j.toString());
    }
}