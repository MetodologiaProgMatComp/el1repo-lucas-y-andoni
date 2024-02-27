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
        Cylinder j = new Cylinder(1,2);
        assertEquals(6.283185307179586,j.getVolume());
    }
}