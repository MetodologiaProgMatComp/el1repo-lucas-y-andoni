package es.uah.matcomp.mp.el1.ejercicios.parte2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author j = new Author("Juan Perez","juanmolon12@hotmail.com",'f');
        assertEquals("Juan Perez",j.getName(),"error");
    }

    @Test
    void getEmail() {
        Author j = new Author("Juan Perez","juanmolon12@hotmail.com",'f');
        assertEquals("juanmolon12@hotmail.com",j.getEmail(),"error");
    }

    @Test
    void getGender() {
        Author j = new Author("Juan Perez","juanmolon12@hotmail.com",'m');
        assertEquals('m',j.getGender(),"error");
    }

    @Test
    void setEmail() {
        Author j = new Author("Juan Perez","juanmolon12@hotmail.com",'f');
        assertDoesNotThrow(()->j.setEmail("newemail@ejemplo.com"));
    }

    @Test
    void testToString() {
        Author j = new Author("Juan Perez","juanmolon12@hotmail.com",'m');
        assertEquals("Author[ name= "+"Juan Perez"+", email= "+"juanmolon12@hotmail.com"+", gender= "+"m"+"]",j.toString(),"error detectado");
    }
}