package es.uah.matcomp.mp.e1.ejerciciosclases.Tests.ejercicios.clase.src.es.uah.matcomp.mp.e1.ejerciciosclases;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String iD, String Dsc, int Qt, double uP) {
        this.id = iD;
        this.desc = Dsc;
        this.qty = Qt;
        this.unitPrice = uP;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int newQty) {
        this.qty = newQty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double newUnitPrice) {
        this.unitPrice = newUnitPrice;
    }

    public double getTotal() {
        return this.unitPrice * (double)this.qty;
    }

    public String toString() {
        return "InvoiceItem[id= " + this.id + ", desc= " + this.desc + " qty = " + this.qty + " unitPrice= " + this.unitPrice + " ]";
    }
}
