package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;
    public MyCircle(){
        center = new MyPoint(0,0);
    }
    public MyCircle(int x, int y, int r){
        radius = r;
        center = new MyPoint(x,y);
    }
    public MyCircle(MyPoint c,int r){
        center = c;
        radius = r;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int newRadius){
        radius = newRadius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint newCenter){
        center = newCenter;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterX(int newX){
        center.setX(newX);
    }
    public void setCenterY(int newY){
        center.setY(newY);
    }
    public void setCenterXY(int newX,int newY){
        center.setXY(newX,newY);
    }
    public String toString(){
        return "MyCircle[radius= "+this.radius+", center="+center.toString()+"]";
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }
}
