package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte4;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int X, int Y, int XSpeed, int YSpeed) {
        x = X;
        y = Y;
        xSpeed = XSpeed;
        ySpeed = YSpeed;
    }

    @Override
    public void moveUp() {
        this.y -= ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "), speed =(" + this.xSpeed + "," + this.ySpeed + ")";
    }
}
