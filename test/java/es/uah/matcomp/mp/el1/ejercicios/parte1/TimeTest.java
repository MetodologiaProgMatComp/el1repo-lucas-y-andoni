package es.uah.matcomp.mp.el1.ejercicios.parte1;

import es.uah.matcomp.mp.el1.ejercicios.parte1.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time j = new Time(1,20,10);
        assertEquals(1,j.getHour(),1);
    }

    @Test
    void getMinute() {
        Time j = new Time(1,20,10);
        assertEquals(20,j.getMinute(),1);
    }

    @Test
    void getSecond() {
        Time j = new Time(1,20,10);
        assertEquals(10,j.getSecond(),1);
    }

    @Test
    void setHour() {
        Time j = new Time(1,20,10);
        assertDoesNotThrow(()->j.setHour(2));
    }

    @Test
    void setMinute() {
        Time j = new Time(1,20,10);
        assertDoesNotThrow(()->j.setMinute(19));
    }

    @Test
    void setSecond() {
        Time j = new Time(1,20,10);
        assertDoesNotThrow(()->j.setSecond(11));
    }

    @Test
    void setTime() {
        Time j = new Time(1,20,10);
        assertDoesNotThrow(()->j.setTime(1,1,1));
    }

    @Test
    void testToString() {
        Time j = new Time(1,8,8);
        assertEquals("01:08:08",j.toString(),"error");
        Time i = new Time(10,10,20);
        assertEquals("10:10:20",i.toString(),"error");
    }

    @Test
    void nextSecond() {
        Time j = new Time(1,1,1);
        Time i = new Time(19,59,59);
        Time u = new Time(1,1,59);
        Time w = new Time(30,59,59);
        assertDoesNotThrow(j::nextSecond);
        assertDoesNotThrow(i::nextSecond);
        assertDoesNotThrow(u::nextSecond);
        assertDoesNotThrow(w::nextSecond);
    }

    @Test
    void previousSecond() {
        Time j = new Time(1,1,1);
        Time i = new Time(2,0,0);
        Time w = new Time(0,1,0);
        Time u = new Time(0,0,0);
        assertDoesNotThrow(j::previousSecond);
        assertDoesNotThrow(i::previousSecond);
        assertDoesNotThrow(w::previousSecond);
        assertDoesNotThrow(u::previousSecond);
    }
}