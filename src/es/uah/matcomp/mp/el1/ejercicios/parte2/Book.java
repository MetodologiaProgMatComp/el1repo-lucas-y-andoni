package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    public Book(String n, Author[] a, Double pr){
        name = n;
        authors = a;
        price = pr;
    }
    public Book(String n, Author[] a, Double pr, int q){
        name = n;
        authors = a;
        price = pr;
        qty = q;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public void setQty(int newQty){
        qty = newQty;
    }
    public String getAuthorNames(){
        String s = "";
        for(int i = 0;i<authors.length;i++){
            s += authors[i].getName()+", ";
        }
        return s;
    }
    public String toString() {
        StringBuilder s = new StringBuilder("Book[name= " + this.name + ", price = " + this.price + ", qty =" + this.qty + ", authors ={");
        for(int i=0;(i< authors.length);i++) {
            s.append(", Author[name = "+authors[i].getName()+", email = "+authors[i].getEmail()+", gender = "+authors[i].getGender()+"]");
        }
        return s.toString();
    }
}
