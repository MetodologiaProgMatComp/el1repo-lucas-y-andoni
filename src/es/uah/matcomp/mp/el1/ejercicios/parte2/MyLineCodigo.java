package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

import java.util.Arrays;

public class MyLineCodigo {
    public static void main(String[] args) {
        // Test Customer class
        MyLine c1 = new MyLine(1, 1, 2, 2);
        System.out.println(c1); // Customer's toString()
        c1.setBegin(new MyPoint(4, 4));
        c1.setEnd(new MyPoint(8, 9));
        System.out.println(c1);
        System.out.println("Begin is: " + c1.getBegin());
        System.out.println("End is: " + c1.getEnd());
        c1.setBeginX(0);
        c1.setBeginY(2);
        c1.setEndX(7);
        c1.setEndY(7);
        System.out.println(c1);
        System.out.println("BeginX is: " + c1.getBeginX());
        System.out.println("BeginY is: " + c1.getBeginY());
        System.out.println("EndX is: " + c1.getEndX());
        System.out.println("EndY is: " + c1.getEndY());
        MyLine c2 = new MyLine(new MyPoint(0, 0), new MyPoint(2, 2));
        c2.setBeginXY(2, 3);
        c2.setEndXY(1, 6);
        System.out.println(c2);
        System.out.println("BeginXY is: " + Arrays.toString(c2.getBeginXY()));
        System.out.println("EndXY is: " + Arrays.toString(c2.getEndXY()));
        System.out.println("length is: " + c2.getLength());
        System.out.println("gradient is: " + c2.getGradient());

    }
}
