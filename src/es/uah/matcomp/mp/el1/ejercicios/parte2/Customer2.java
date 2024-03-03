package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Customer2 {
    private int id;
    private String name;
    private char gender;
    public Customer2(int iD,String n, char g){
        id = iD;
        name = n;
        gender = g;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return "name("+this.id+")";
    }
}
