package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

public class Square extends Rectangle{
    public Square(){}
    public Square(double s){
        super(s,s);
    }
    public Square(double s,String color, Boolean filled){
        super(s,s,color,filled);
    }
    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setWidth(double newWidth) {
        super.setWidth(newWidth);
    }

    @Override
    public void setLength(double newLength) {
        super.setLength(newLength);
    }
    @Override
    public String toString(){
        return "Square"+super.toString()+"]";
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double newSide){
        super.setLength(newSide);
        super.setWidth(newSide);
    }
}
