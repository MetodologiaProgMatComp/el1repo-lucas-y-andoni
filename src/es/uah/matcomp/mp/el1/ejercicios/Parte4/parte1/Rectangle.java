package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

public class Rectangle extends Shape{
    protected double length;
    protected double  width;

    public Rectangle() {}

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return length*2+width*2;
    }
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }
    public Rectangle(double w, double l,String c,boolean f) {
        width = w;
        length = l;
        color = c;
        filled = f;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double newLength) {
        length = newLength;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }
    @Override
    public String toString() {
        return "Rectangle[Shape[color = "+this.color+", filled = "+this.filled+"]length=" + length + ",width=" + width + "]";
    }
}
