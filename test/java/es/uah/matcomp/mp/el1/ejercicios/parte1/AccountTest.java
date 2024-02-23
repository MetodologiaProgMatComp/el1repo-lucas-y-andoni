package es.uah.matcomp.mp.el1.ejercicios.parte1;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account j = new Account("iD","nM",0);
        assertEquals("iD",j.getID(),"error Detectado");
    }

    @Test
    void getName() {
        Account j = new Account("iD","nM");
        assertEquals("nM",j.getName(),"error detectado");
    }

    @Test
    void getBalance() {
        Account j = new Account("iD","nM");
        assertEquals(1,j.getBalance(),1);

    }

    @Test
    void credit() {
        Account j = new Account("iD","nM");
        assertEquals(1,j.credit(1),1);
    }

    @Test
    void debit() {
        Account j = new Account("iD","nM",12);
        assertDoesNotThrow(()->j.debit(15));
        assertEquals(10,j.debit(1),1);
        Account i = new Account("iD","nM",2);
        assertEquals(1,i.debit(1),1);
    }

    @Test
    void transferTo() {
        Account j = new Account("iD","nM",10);
        assertEquals(10,j.transferTo(j,1),"error Detectado");
        Account i = new Account("iD","nM",5);
        assertDoesNotThrow(()->j.transferTo(i,11));

    }

    @Test
    void testToString() {
        Account j = new Account("iD","nM",0);
        assertEquals("Account[id= " + "iD" + ", name= " + "nM" + " balance = " + 0 + "]",j.toString(),"error");
    }
}