package es.uah.matcomp.mp.el1.ejercicios.parte3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertEquals("ESO",j.getProgram());
    }

    @Test
    void setProgram() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertDoesNotThrow(()->j.setProgram("Bachillerato"));
    }

    @Test
    void getYear() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertEquals(2,j.getYear());
    }

    @Test
    void setYear() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertDoesNotThrow(()->j.setYear(3));
    }

    @Test
    void getFee() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertEquals(122,j.getFee());
    }

    @Test
    void setFee() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertDoesNotThrow(()->j.setFee(123));
    }

    @Test
    void testToString() {
        Student j = new Student("pepe","San Blas","ESO", 2,122);
        assertEquals("Student[Person[name= pepe, address= San Blas], program= ESO, year= 2, fee= 122.0]",j.toString());
    }
}