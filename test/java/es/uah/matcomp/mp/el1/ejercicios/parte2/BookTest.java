package es.uah.matcomp.mp.e1.ejerciciosclases.test.java.es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author a1 = new Author("Carlos","caarlos@",'m');
    Author a2 = new Author("Kamil","kaamil@",'f');
    Author a3 = new Author("LALA","lalala@",'m');
    Author[] as = {a1,a2,a3};
    Author[] as2 = {a1,a2};

    Book b1 = new Book("Estrellita",as,10.95);
    Book b2 = new Book("Principe",as2,14.87,200);
    @Test
    void getName() {
        assertEquals("Estrellita",b1.getName());
    }

    @Test
    void getAuthors() {
        assertEquals(as,b1.getAuthors());
    }

    @Test
    void getPrice() {
        assertEquals(14.87,b2.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(200,b2.getQty());
    }

    @Test
    void setPrice() {
        assertDoesNotThrow(()->b1.setPrice(34));
    }

    @Test
    void setQty() {
        assertDoesNotThrow(()->b2.setQty(600));
    }

    @Test
    void getAuthorNames() {
        assertEquals("Carlos, Kamil, ",b2.getAuthorNames());
    }

    @Test
    void testToString() {
        assertEquals("Book[name= Principe, price = 14.87, qty =200, authors ={, Author[name = "+as[0].getName()+", email = "+as[0].getEmail()+", gender = "+as[0].getGender()+"], Author[name = "+as[1].getName()+", email = "+as[1].getEmail()+", gender = "+as[1].getGender()+"]",b2.toString());
    }
}