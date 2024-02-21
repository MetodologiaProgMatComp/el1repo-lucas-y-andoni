package es.uah.matcomp.mp.el1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle j = new Rectangle();
        assertEquals(1.0,j.getLength(), 1.0);
    }

    @Test
    void setLength() {
        Rectangle j = new Rectangle(1.1f, 1.0f);
        assertDoesNotThrow(()->j.setLength(1.1f));
    }

    @Test
    void getWidth() {
        Rectangle j = new Rectangle();
        assertEquals(1.0, j.getWidth(), 1.0);
    }

    @Test
    void setWidth() {
        Rectangle j = new Rectangle();
        assertDoesNotThrow(()->j.setWidth(1.1f));
    }

    @Test
    void getArea() {
        Rectangle j = new Rectangle();
        assertEquals(1.0, j.getArea(), 1.0);
    }

    @Test
    void getPerimeter() {
        Rectangle j = new Rectangle();
        assertEquals(4.0, j.getPerimeter(), 1.0);
    }

    @Test
    void testToString() {
        Rectangle j = new Rectangle();
        assertEquals("Rectangle[length="+1.0+",width=1.0]", j.toString(), "Se ha detectado un error");
    }
}