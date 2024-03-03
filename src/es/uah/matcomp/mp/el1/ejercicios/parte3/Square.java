package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double newSide) {
        super.setLength(newSide);
        super.setWidth(newSide);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
