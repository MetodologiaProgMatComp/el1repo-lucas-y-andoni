package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice i1 = new Invoice(1,new Customer1(11,"Juan",5),50);

    @Test
    void getId() {
        assertEquals(1,i1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(11,i1.getCustomer().getId());
        assertEquals("Juan",i1.getCustomer().getName());
        assertEquals(5,i1.getCustomer().getDiscount());
    }

    @Test
    void setCustomer() {
        assertDoesNotThrow(()->i1.setCustomer(new Customer1(3,"pepe",50)));
    }

    @Test
    void getAmount() {
        assertEquals(50,i1.getAmount());
    }

    @Test
    void setAmount() {
        assertDoesNotThrow(()->i1.setAmount(56.4));
    }

    @Test
    void getCustomerId() {
        assertEquals(11,i1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("Juan",i1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(5,i1.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(i1.getAmount()-(i1.getAmount()*((double) i1.getCustomerDiscount() /100)),i1.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        assertEquals("InvoiceItem[id= " + i1.getId() + ", customer= " + i1.getCustomerName() + "("+ i1.getCustomerId() +")("+ i1.getCustomerDiscount() +"%), amount= "+ i1.getAmount()+"]",i1.toString());
    }
}