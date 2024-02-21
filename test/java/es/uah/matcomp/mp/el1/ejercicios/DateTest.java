package es.uah.matcomp.mp.el1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date j = new Date(1,2,2005);
        assertEquals(1,j.getDay(),1);
    }

    @Test
    void getMonth() {
        Date j = new Date(1,2,2005);
        assertEquals(2,j.getMonth(),2);
    }

    @Test
    void getYear() {
        Date j = new Date(1,2,2005);
        assertEquals(2005,j.getYear(),2005);
    }

    @Test
    void setDay() {
        Date j = new Date(1,2,2005);
        assertDoesNotThrow(()->j.setDay(1));
    }

    @Test
    void setMonth() {
        Date j = new Date(1,2,2005);
        assertDoesNotThrow(()->j.setMonth(2));
    }

    @Test
    void setYear() {
        Date j = new Date(1,2,2005);
        assertDoesNotThrow(()->j.setYear(2005));
    }

    @Test
    void setDate() {
        Date j = new Date(1,2,2005);
        assertDoesNotThrow(()->j.setDate(1,2,2005));
    }

    @Test
    void testToString() {
        Date j = new Date(1,2,2005);
        assertEquals("01/02/2005",j.toString(),"error");
        Date i = new Date(15,12,2024);
        assertEquals("15/12/2024",i.toString(),"error");

    }
}