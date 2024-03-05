package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte3;

import parte2.Circle;

public class Codigo {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(2, 3, 4, 1);
        System.out.println(p1); // which version?
        p1.moveDown();
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
    }
}
