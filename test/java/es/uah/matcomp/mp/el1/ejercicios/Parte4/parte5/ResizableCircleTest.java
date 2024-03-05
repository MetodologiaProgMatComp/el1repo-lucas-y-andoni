package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    ResizableCircle c1 = new ResizableCircle(4);

    @Test
    void resize() {
        assertDoesNotThrow(()->c1.resize(345));
    }

    @Test
    void testToString() {
        assertEquals("ResizableCircle["+new Circle(4).toString()+
                ']',c1.toString());
    }
}