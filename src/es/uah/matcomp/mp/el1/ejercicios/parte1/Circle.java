package es.uah.matcomp.mp.el1.ejercicios.parte1;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircunference() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
