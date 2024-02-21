package es.uah.matcomp.mp.el1.ejercicios;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setDate(int newDay, int newMonth, int newYear) {
        this.day = newDay;
        this.month = newMonth;
        this.year = newYear;
    }

    public String toString() {
        String newDay;
        String newMonth;
        if(this.day<= 9) {
            newDay= "0"+String.valueOf(this.day);
        }
        else {
            newDay=String.valueOf(this.day);
        }
        if(this.month<= 9) {
            newMonth= "0"+String.valueOf(this.month);
        }
        else{
            newMonth= String.valueOf(this.month);
        }
        return newDay + "/" + newMonth + "/" + this.year;
    }
}
