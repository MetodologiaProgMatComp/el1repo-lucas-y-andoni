package es.uah.matcomp.mp.el1.ejercicios.parte1;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle j = new Circle();
        assertEquals(1.1, j.getRadius(), 1.1);
    }

    @Test
    void setRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(()->j.setRadius(1.1));
        assertEquals(1.1,j.getRadius(),"Los radios no coinciden.");
    }

    @Test
    void getArea() {
        Circle j = new Circle();
        assertEquals(Math.PI, j.getArea(), 1.1);
    }

    @Test
    void getCircunference() {
        Circle j = new Circle(1.1);
        assertEquals(Math.PI*2, j.getCircunference(), 1.0);
    }

    @Test
    void testToString() {
        Circle j = new Circle();
        assertEquals("Circle[radius="+1.0+"]", j.toString(), "Se ha detectado un error.");
    }
}