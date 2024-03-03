package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float newXSpeed) {
        this.xSpeed = newXSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float newYSpeed) {
        this.ySpeed = newYSpeed;
    }
    public void setSpeed(float newXSpeed, float newYSpeed) {
        this.xSpeed = newXSpeed;
        this.ySpeed = newYSpeed;
    }
    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
    public MovablePoint move() {
        float newX = super.getX() + xSpeed;
        float newY = super.getY() + ySpeed;
        super.setX(newX);
        super.setY(newY);
        return this;
    }
}
