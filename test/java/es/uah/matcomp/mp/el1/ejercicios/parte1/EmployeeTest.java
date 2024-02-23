package es.uah.matcomp.mp.el1.ejercicios.parte1;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals(1.0,j.getId(),1.0);
    }

    @Test
    void getFirstName() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals("FN",j.getFirstName(),"nombre del empleado");
    }

    @Test
    void getLastName() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals("IN",j.getLastName(),"Apellido del empleado.");
    }

    @Test
    void getName() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals("FN IN",j.getName(),"Nombre completo del empleado.");
    }

    @Test
    void getSalary() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals(4,j.getSalary(),"");
    }

    @Test
    void setSalary() {
        Employee j = new Employee(1,"FN","IN",4);
        assertDoesNotThrow(()->j.setSalary(1));
    }

    @Test
    void getAnnualSalary() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals(48.0,j.getAnnualSalary(), 1.0);
    }

    @Test
    void raiseSalary() {
        Employee j = new Employee(1,"FN","IN",4);
        assertDoesNotThrow(()->j.raiseSalary(1));
        assertEquals(4,j.raiseSalary(1), 1.0);
    }

    @Test
    void testToString() {
        Employee j = new Employee(1,"FN","IN",4);
        assertEquals("Employee[id= 1" + ", name= FN IN, salary= 4 ]",j.toString(),"Se ha detectado un error.");
    }
}