package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Point2DCodigo {
    public static void main(String[] args) {
        Point2D punto1 = new Point2D(1,1);
        System.out.println("Coordenadas iniciales: " + punto1.getX() + ", " + punto1.getY());
        punto1.setX(2);
        System.out.println("Coordenadas secundarias: " + punto1.getX() + ", " + punto1.getY());
        punto1.setXY(3,3);
        System.out.println("Coordenadas finales: " + punto1.getX() + ", " + punto1.getY());
        System.out.println("punto1 = " + punto1.toString());
        Point3D punto2 = new Point3D();
        System.out.println("punto2 = " + punto2.toString());
        punto2.setXYZ(1,1,1);
        System.out.println("Eje X:" + punto2.getX()
                            + "\nEje Y: " + punto2.getY()
                            + "\nEje Z: " + punto2.getZ()
        );
        punto2.setY(3);
        System.out.println("Coordenadas nuevas: " + punto2.toString());
    }
}
