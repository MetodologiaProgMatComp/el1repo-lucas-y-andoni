package es.uah.matcomp.mp.el1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals("iD",j.getId(), "error");
    }

    @Test
    void getDesc() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals("Dsc",j.getDesc(),"error");
    }

    @Test
    void getQty() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals(1,j.getQty(), 1);
    }

    @Test
    void setQty() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertDoesNotThrow(()->j.setQty(1));
    }

    @Test
    void getUnitPrice() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals(1.0,j.getUnitPrice(),1.0);
    }

    @Test
    void setUnitPrice() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertDoesNotThrow(()->j.setUnitPrice(1.0));
    }

    @Test
    void getTotal() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals(1.0,j.getTotal(),1.0);
    }

    @Test
    void testToString() {
        InvoiceItem j = new InvoiceItem("iD", "Dsc", 1, 1.0);
        assertEquals("InvoiceItem[id= "+"iD"+", desc= "+"Dsc"+" qty = "+1+" unitPrice= "+1.0+" ]",j.toString(),"error detectado");
    }
}