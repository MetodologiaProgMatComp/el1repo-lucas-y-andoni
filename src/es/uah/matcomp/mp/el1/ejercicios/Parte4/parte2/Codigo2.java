package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte2;

public class Codigo2 {
    public static void main(String[] args) {
        GeometriaObject s1 = new Circle(5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        Circle s10 = new Circle(5.5);

        GeometriaObject s3 = new Rectangle(1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
    }
}
