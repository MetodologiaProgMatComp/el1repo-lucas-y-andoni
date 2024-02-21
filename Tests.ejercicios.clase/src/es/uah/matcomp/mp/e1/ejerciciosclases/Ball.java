package es.uah.matcomp.mp.e1.ejerciciosclases.Tests.ejercicios.clase.src.es.uah.matcomp.mp.e1.ejerciciosclases;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float dx, float dy, int r, float xD, float yD) {
        this.x = dx;
        this.y = dy;
        this.radius = r;
        this.xDelta = xD;
        this.yDelta = yD;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float newX) {
        this.x = newX;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float newY) {
        this.y = newY;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public float getXDelta() {
        return this.xDelta;
    }

    public float getYDelta() {
        return this.yDelta;
    }

    public void setXDelta(float newXDelta) {
        this.xDelta = newXDelta;
    }

    public void setYDelta(float newYDelta) {
        this.yDelta = newYDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    public String toString() {
        return "Ball[(" + this.x + "," + this.y + "), speed=(" + this.xDelta + "," + this.yDelta + ")]";
    }
}
