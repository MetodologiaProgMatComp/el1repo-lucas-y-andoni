package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte5;

import parte2.Circle;
import parte2.GeometriaObject;
import parte2.Rectangle;

public class Codigo5 {
    public static void main(String[] args) {
        parte2.GeometriaObject s1 = new parte2.Circle(5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        parte2.Circle s10 = new Circle(5.5);

        Resizable s3 = new ResizableCircle(3); // Upcast
        System.out.println(s3);
        s3.resize(32);
        System.out.println(s3);
    }
}
