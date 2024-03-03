package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
        z = 0.0f;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float newZ) {
        this.z = newZ;
    }
    public void setXYZ(float newX, float newY, float newZ) {
        super.setX(newX);
        super.setY(newY);
        this.z = newZ;
    }
    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result;
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY()
                + ", " + z + ")";
    }
}
