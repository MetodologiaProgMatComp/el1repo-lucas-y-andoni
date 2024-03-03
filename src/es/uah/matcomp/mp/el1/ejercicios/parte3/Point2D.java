package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Point2D {
    private float x;
    private float y;
    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float newX) {
        this.x = newX;
    }
    public float getY() {
        return y;
    }
    public void setY(float newY) {
        this.y = newY;
    }
    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }
    public float[] getXY() {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
