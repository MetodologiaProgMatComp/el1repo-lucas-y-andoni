package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte2;

public class Rectangle implements GeometriaObject{
    private double length;
    private double  width;

    public Rectangle() {}

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return length*2+width*2;
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;

    }
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}
