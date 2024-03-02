package es.uah.matcomp.mp.el1.ejercicios.parte3;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Circle;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super();
        height = 1.0;
    }
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public double getArea() {
        return Math.PI*2*getRadius()*getHeight() + 2*super.getArea();
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}
