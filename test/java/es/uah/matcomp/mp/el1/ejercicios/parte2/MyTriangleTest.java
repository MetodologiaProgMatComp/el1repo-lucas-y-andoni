package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    MyTriangle t1 = new MyTriangle(1,2,5,4,8,6);
    MyTriangle t2 = new MyTriangle(new MyPoint(0,0),new MyPoint(6,0), new MyPoint(3,5));

    @Test
    void testToString() {
        assertEquals("MyTriangle[v1=(1,2), v2=(5,4), v3=(8,6)]",t1.toString());
    }

    @Test
    void getPerimeter() {
        assertEquals(6+2*sqrt(34),t2.getPerimeter());
    }

    @Test
    void getType() {
        assertEquals("Isosceles",t2.getType());
        assertEquals("Scalene",t1.getType());

    }
}