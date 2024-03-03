package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Account {
   private int id;
    private Customer2 customer;
    private double balance = 0.0;

    public Account(int iD, Customer2 c,double b) {
        this.id = iD;
        this.customer = c;
        this.balance = b;
    }

    public Account(int iD, Customer2 c) {
        this.id = iD;
        this.customer = c;
    }
    public int getID() {
        return this.id;
    }

    public Customer2 getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public String toString() {
        return customer.toString()+" balance= "+Math.round(balance);
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }
    public Account withdraw(double amount){
        if(balance>=amount){
            this.balance -= amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}