package es.uah.matcomp.mp.e1.ejerciciosclases.Tests.ejercicios.clase.src.es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int iD, String fN, String lN, int sl) {
        this.id = iD;
        this.firstName = fN;
        this.lastName = lN;
        this.salary = sl;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary = this.salary * (100 + percent) / 100;
        return this.salary;
    }

    public String toString() {
        return "Employee[id= " + this.id + ", name= " + this.firstName + " " + this.lastName + ", salary= " + this.salary + " ]";
    }
}
