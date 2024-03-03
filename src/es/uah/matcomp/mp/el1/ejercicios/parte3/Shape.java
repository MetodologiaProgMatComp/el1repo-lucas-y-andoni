package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filler) {
        this.color = color;
        this.filled = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filler) {
        this.filled = filler;
    }
    public String toString() {
        return "Shape[color= " + color + ", filled= " + filled + "]";
    }

}
