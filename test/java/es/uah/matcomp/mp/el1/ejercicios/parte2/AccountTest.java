package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account a1 = new Account(1,new Customer2(2,"Jose",'m'));
    Account a2 = new Account(2,new Customer2(3,"María",'f'),5);
    @org.junit.jupiter.api.Test
    void getID() {
        assertEquals(1,a1.getID());
    }

    @org.junit.jupiter.api.Test
    void getCustomer2() {
        Customer2 c1 = new Customer2(2,"Jose",'m');
        assertEquals(c1.getName(),a1.getCustomer().getName());
        assertEquals(c1.getId(),a1.getCustomer().getId());
        assertEquals(c1.getGender(),a1.getCustomer().getGender());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(0.0,a1.getBalance());
    }

    @org.junit.jupiter.api.Test
    void setBalance() {
        assertDoesNotThrow(()->a2.setBalance(243));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(a1.getCustomer().toString()+" balance= "+Math.round(a1.getBalance()),a1.toString());
    }

    @org.junit.jupiter.api.Test
    void getCustomerName() {
        assertEquals("María",a2.getCustomerName());
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        assertDoesNotThrow(()->a2.deposit(6.8));
    }

    @org.junit.jupiter.api.Test
    void withdraw() {

        assertDoesNotThrow(()->a2.withdraw(99.8));
        assertDoesNotThrow(()->a2.withdraw(4));
    }
}