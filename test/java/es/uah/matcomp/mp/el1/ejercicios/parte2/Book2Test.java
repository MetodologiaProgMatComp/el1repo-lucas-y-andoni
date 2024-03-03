package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Book2Test {
    Book2 b2 = new Book2("Pi",new Author2("Andoni","aaa@"),9.95,"0124343Adf");
    Book2 b1 = new Book2("CasaNova",new Author2("Lola","lolaaa@"),14.95,140,"234534drt3");

    @Test
    void getName() {
        assertEquals("Pi",b2.getName());
    }

    @Test
    void getAuthorName() {
        assertEquals("Andoni",b2.getAuthorName());
    }

    @Test
    void getIsbn() {
        assertEquals("234534drt3",b1.getIsbn());
    }

    @Test
    void getAuthor() {
        assertEquals("Lola",b1.getAuthor().getName());
        assertEquals("lolaaa@",b1.getAuthor().getEmail());
    }

    @Test
    void getPrice() {
        assertEquals(9.95,b2.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(140,b1.getQty());
    }

    @Test
    void setPrice() {
        assertDoesNotThrow(()->b1.setPrice(34.54));
    }

    @Test
    void setQty() {
        assertDoesNotThrow(()->b1.setQty(9999));
    }

    @Test
    void testToString() {
        assertEquals("Book[isbn = "+b2.getIsbn()+", name= "+b2.getName()+"," +b2.getAuthor().toString()+
                ", price="+b2.getPrice()+", qty= "+b2.getQty()+"]",b2.toString());
    }
}