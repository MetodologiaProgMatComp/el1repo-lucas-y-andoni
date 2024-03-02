package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder j = new Cylinder();
        Cylinder i = new Cylinder(1);
        assertEquals(1,j.getHeight());
    }

    @Test
    void getVolume() {
        //Tras añadir la sobrecarga del metodo getArea, este metodo devuelve un valor calculado con el area del cilindro, en vez de la del circulo.
        Cylinder j = new Cylinder(1,2);
        assertEquals(6.283185307179586,j.getVolume());
    }
    @Test
    void setHeigth() {
        Cylinder c = new Cylinder(1,2);
        assertDoesNotThrow(()->c.setHeight(1));
    }
    @Test
    void testToString() {
        Cylinder c = new Cylinder(1,1);
        assertDoesNotThrow(()->c.toString());
    }
    @Test
    void getArea() {
        Cylinder c = new Cylinder(1,1);
        assertEquals(12.566370614359172,c.getArea());
    }
}