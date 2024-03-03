package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

import java.util.Arrays;

public class MyCircleCodigo {
    public static void main(String[] args) {
        // Test Customer class
        MyCircle c1 = new MyCircle();
        System.out.println(c1); // Customer's toString()

        MyCircle c2 = new MyCircle(2,3,5);
        System.out.println(c2); // Customer's toString()
        c2.setRadius(2);
        c2.setCenter(new MyPoint(0,0));
        System.out.println(c2);
        System.out.println("radius is: " + c2.getRadius());
        System.out.println("center is: " + c2.getCenter());

        MyCircle c3 = new MyCircle(new MyPoint(1,4),10);
        System.out.println(c3);
        c3.setCenterX(2);
        c3.setCenterY(3);
        System.out.println("centerX is: " + c3.getCenterX());
        System.out.println("centerY is: " + c3.getCenterY());
        c3.setCenterXY(0,0);
        System.out.println("centerXY is: " + Arrays.toString(c3.getCenterXY()));
        System.out.println("Area is: " + c3.getArea());
        System.out.println("Circunference is: " + c3.getCircumference());
        System.out.println("Distance from circle center(2,2) radius 5 is: " + c3.distance(new MyCircle(2,2,5)));
    }
}
