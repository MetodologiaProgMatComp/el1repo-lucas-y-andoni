package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square j = new Square(1);
        j.getSide();
        assertEquals(1,j.getArea());
    }

    @Test
    void setSide() {
        Square j = new Square(2);
        assertDoesNotThrow(()->j.setSide(1));
    }

    @Test
    void setWidth() {
        Square j = new Square(2, "purpura", true);
        j.setWidth(2);
        assertDoesNotThrow(()->j.setSide(12));
    }

    @Test
    void setLength() {
        Square j = new Square();
        j.setLength(12);
        assertDoesNotThrow(()->j.setSide(12));
    }

    @Test
    void testToString() {
        Square j = new Square(2);
        assertEquals("Square[Rectangle[Shape[color= red, filled= true], width= 2.0, length= 2.0]]",j.toString());
    }
}