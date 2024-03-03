package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Customer1 {
    private int id;
    private String name;
    private int discount;
    public Customer1(int iD,String n, int d){
        id = iD;
        name = n;
        discount = d;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getDiscount(){
        return this.discount;
    }
    public void setDiscount(int newDiscount){
        discount = newDiscount;
    }
    public String toString(){
        return "name("+this.id+")("+this.discount+")";
    }

}
