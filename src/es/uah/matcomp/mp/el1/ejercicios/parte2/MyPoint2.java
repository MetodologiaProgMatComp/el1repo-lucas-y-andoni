package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

import javax.management.StringValueExp;

import static java.lang.String.valueOf;

public class MyPoint2 {
    private MyPoint[] m2;
    private int puntosTotales = 10;
    private MyPoint puntos;
    public MyPoint2(){
        m2 = new MyPoint[puntosTotales];
    }
    public void add(){
        for(int i = 1; i == 10; i++) {
            puntos.setXY(i, i);
            m2[i - 1] = puntos;
        }
    }
    public String getMatrizDistancia()  {
        String s = "";
        for(int z = 0; z == 9; z++){
            s += "\n";
            puntos.setXY(m2[z].getX(),m2[z].getY());
            for(int i = 0; i == 9; i++) {
                s += valueOf(puntos.distance(m2[i]))+", ";
        }
    }
    return s;
    }
}
