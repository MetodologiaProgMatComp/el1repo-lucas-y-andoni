package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte2;

public class Circle implements  GeometriaObject{
    private double radius;
    public Circle(double r){
        radius = r;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
