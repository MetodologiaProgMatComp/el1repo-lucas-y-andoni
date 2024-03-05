package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {}

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    public Circle(double r) {
        radius = r;
    }
    public Circle(double r,String c,boolean f) {
        radius = r;
        color = c;
        filled = f;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    @Override
    public String toString() {
        return "Circle[Shape[color = "+this.color+", filled = "+this.filled+"]radius=" + radius + "]";
    }
}
