package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class Invoice {
    private int id;
    private Customer1 customer;
    private double amount;
    public Invoice(int iD, Customer1 c, double a){
        id =iD;
        customer = c;
        amount = a;
    }
    public int getId(){
        return this.id;
    }
    public Customer1 getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer1 newCustomer) {
        customer = newCustomer;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double newAmount) {
        amount = newAmount;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return amount-(amount*((double) getCustomerDiscount() /100));
    }
    public String toString() {
        return "InvoiceItem[id= " + this.id + ", customer= " + getCustomerName() + "("+ getCustomerId() +")("+ getCustomerDiscount() +"%), amount= "+ this.amount+"]";
    }

}
