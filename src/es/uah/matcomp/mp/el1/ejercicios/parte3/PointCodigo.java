package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class PointCodigo {
    public static void main(String[] args) {
        Point punto1 = new Point(1,1);
        Point punto2 = new Point();
        System.out.println("Punto1 = " + punto1.toString()
                            + "\nPunto2 = " + punto2.toString()
        );
        punto1.setX(2.2f);
        punto1.setY(3.54f);
        System.out.println("Eje x = " + punto1.getX() +
                            "\nEjeY = " + punto1.getY()
        );
        MovablePoint punto3 = new MovablePoint(1,1);
        System.out.println("Velocidad en el eje X = "+punto3.getxSpeed() + "\nVelocidad en el eje Y = " + punto3.getySpeed());
        MovablePoint punto4 = new MovablePoint(1,1,1,1);
        punto4.setxSpeed(2);
        punto4.setySpeed(3);
        System.out.println("Coordenadas iniciales = " + punto4.toString() + "\nCoordenadas finales = " + punto4.move().toString());
    }
}
