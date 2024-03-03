package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class MyTriangleCodigo {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1,1,2,2,3,3); // Test constructor
        System.out.println(t1); // Test toString()
        MyTriangle t2 = new MyTriangle(new MyPoint(0,2),new MyPoint(1,1),new MyPoint(3,4)); // Test constructor
        System.out.println(t2); // Test toString()
        System.out.println("Perimeter of t2 is: " + t2.getPerimeter());
        System.out.println("Type of t2 is: " + t2.getType());
        }
}
