package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape r2 = new Rectangle(7,3,"red",true){};
    Shape c1 = new Circle(3,"green",false);

    @Test
    void getColor() {
        assertEquals("green",c1.getColor());
    }

    @Test
    void setColor() {
        assertDoesNotThrow(()->r2.setColor("plateado jeje"));
    }

    @Test
    void isFilled() {
        assertEquals(false,c1.isFilled());
    }

    @Test
    void setFilled() {
        assertDoesNotThrow(()->r2.setFilled(false));
    }
}