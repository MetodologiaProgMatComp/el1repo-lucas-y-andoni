package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class ShapeCodigo {
    public static void main(String[] args) {
        Square cuadrado1 = new Square(1,"Morado", true);
        System.out.println("Información general: " + cuadrado1.toString());
        cuadrado1.setLength(2);
        System.out.println("Información 2: " + cuadrado1.toString());
        Rectangle rect1 = new Rectangle(1,2,"Rosa", false);
        rect1.setWidth(3);
        rect1.setLength(4);
        System.out.println("Información general: " + rect1.toString());
        Circle circulo = new Circle(2,"Azul", false);
        System.out.println("Area del circulo: " + circulo.getArea());
        System.out.println("Area del rectangulo: " + rect1.getArea());
        System.out.println("Area del cuadrado: " + cuadrado1.getArea());
    }
}
