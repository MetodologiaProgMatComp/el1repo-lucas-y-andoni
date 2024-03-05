package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte1;

public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;
    public Shape(){};
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
        return "Shape[color= "+this.color+", filled "+this.filled+"]";

    }
}
