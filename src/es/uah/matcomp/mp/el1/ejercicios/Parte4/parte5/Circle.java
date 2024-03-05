package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte5;

public class Circle implements GeometriaObject{
    protected double radius;
    public Circle(double r){
        radius = r;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
