package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte4;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int r){
        super(x,y,xSpeed,ySpeed);
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        radius = r;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    public String toString(){
        return center.toString()+", radius= "+this.radius;
    }
}
