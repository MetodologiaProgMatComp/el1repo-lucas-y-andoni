package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

import static java.lang.Math.sqrt;

public class MyPoint {
    private int x = 0;
    private int y = 0;
    public MyPoint(){}
    public MyPoint(int X, int Y){
        x = X;
        y = Y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;

    }
    public void setXY(int newX,int newY){
        x = newX;
        y = newY;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public double distance(int X, int Y){
        int X1 = getX();
        int Y1 = getY();
        this.x = X;
        this.y = Y;
        return sqrt((X1-X)*(X1-X)+(Y1-Y)*(Y1-Y));
    }
    public double distance(MyPoint another){
        return sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
    }
    public double distance(){
        return sqrt(this.x*this.x+this.y*this.y);
    }
}
