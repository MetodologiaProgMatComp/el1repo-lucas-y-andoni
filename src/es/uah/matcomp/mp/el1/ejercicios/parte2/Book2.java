package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Book2 {
    private String name;
    private String isbn;
    private Author2 author;
    private double price;
    private int qty = 0;
    public Book2(String n, Author2 a, Double pr, String i){
        name = n;
        author = a;
        price = pr;
        isbn = i;
    }
    public Book2(String n, Author2 a, Double pr, int q, String i){
        name = n;
        author = a;
        price = pr;
        qty = q;
        isbn = i;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthorName(){
        return this.author.getName();
    }
    public String getIsbn(){
        return this.isbn;
    }
    public Author2 getAuthor(){
        return this.author;
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
    public String toString() {
        return "Book[isbn = "+this.isbn+", name= "+this.name+"," +this.author.toString()+
                ", price="+this.price+", qty= "+this.qty+"]";
    }
}
