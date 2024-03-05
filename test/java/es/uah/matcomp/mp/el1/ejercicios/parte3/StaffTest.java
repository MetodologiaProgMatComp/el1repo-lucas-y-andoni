package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff s = new Staff("pepa","San Jucar de Guarromán","colegio de las carmelitas de SanJuan",1222);
        assertEquals("colegio de las carmelitas de SanJuan",s.getSchool());
    }

    @Test
    void setSchool() {
        Staff s = new Staff("pepa","San Jucar de Guarromán","colegio de las carmelitas de SanJuan",1222);
        assertDoesNotThrow(()->s.setSchool("San Gabriel"));
    }

    @Test
    void getPay() {
        Staff s = new Staff("pepa","San Jucar de Guarromán","colegio de las carmelitas de SanJuan",1222);
        assertEquals(1222,s.getPay());
    }

    @Test
    void setPay() {
        Staff s = new Staff("pepa","San Jucar de Guarromán","colegio de las carmelitas de SanJuan",1222);
        assertDoesNotThrow(()->s.setPay(1222.99));
    }

    @Test
    void testToString() {
        Staff s = new Staff("pepa","San Jucar de Guarromán","colegio de las carmelitas de SanJuan",1222);
        assertEquals("Staff[Person[name= pepa, address= San Jucar de Guarromán], school= colegio de las carmelitas de SanJuan, pay= 1222.0",s.toString());
    }
}