package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.Parte4.parte4;

import parte3.Movable;
import parte3.MovablePoint;

public class Codigo4 {
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


        MovableCircle p2 = new MovableCircle(2, 3, 4, 1,5);
        System.out.println(p2); // which version?
        p2.moveDown();
        System.out.println(p2);
        p2.moveUp();
        System.out.println(p2);
        p2.moveLeft();
        System.out.println(p2);
        p2.moveRight();
        System.out.println(p2);
    }
}
