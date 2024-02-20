package es.uah.matcomp.mp.e1.ejerciciosclases.Tests.ejercicios.clase.src.es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public void setMinute(int newMinute) {
        this.minute = newMinute;
    }

    public void setSecond(int newSecond) {
        this.second = newSecond;
    }

    public void setTime(int newHour, int newMinute, int newSecond) {
        this.hour = newMinute;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public Time nextSecond() {
        return null;
    }

    public Time previousSecond() {
        return null;
    }

}
