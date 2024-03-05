package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1 = new Point3D(1,1,1);
        assertEquals(1,p1.getZ());
        assertEquals(1,p1.getY());
        assertEquals(1,p1.getX());
    }

    @Test
    void setZ() {
        Point3D p1 = new Point3D(1,1,1);
        assertDoesNotThrow(()->p1.setZ(2));
    }

    @Test
    void setXYZ() {
        Point3D p1 = new Point3D();
        assertDoesNotThrow(()->p1.setXYZ(1,1,1));
        p1.getXYZ();
    }
    @Test
    void testToString() {
        Point3D p1 = new Point3D(1,1,1);
        assertEquals("(1.0, 1.0, 1.0)",p1.toString());
    }
}