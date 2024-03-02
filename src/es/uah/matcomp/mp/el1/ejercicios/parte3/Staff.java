package es.uah.matcomp.mp.el1.ejercicios.parte3;

public class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String newSchool) {
        this.school = newSchool;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double newPay) {
        this.pay = newPay;
    }
    @Override
    public String toString() {
        return "Staff[Person[name= " + getName() + ", address= " +
                getAddress() + "], school= " + school + ", pay= " + pay;
    }
}
