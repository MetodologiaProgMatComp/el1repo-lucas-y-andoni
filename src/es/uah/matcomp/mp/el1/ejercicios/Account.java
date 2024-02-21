package es.uah.matcomp.mp.el1.ejercicios;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String iD, String nM) {
        this.id = iD;
        this.name = nM;
    }

    public Account(String iD, String nM, int Bl) {
        this.id = iD;
        this.name = nM;
        this.balance = Bl;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public Object transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance-=amount;
            another.balance += amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public String toString() {
        return "Account[id= " + this.id + ", name= " + this.name + " balance = " + this.balance + "]";
    }
}
