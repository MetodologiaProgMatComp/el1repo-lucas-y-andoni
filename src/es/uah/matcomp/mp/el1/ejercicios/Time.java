package es.uah.matcomp.mp.el1.ejercicios;

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
        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public String toString() {
        String newHour;
        String newMinute;
        String newSecond;
        if (this.hour <= 9)
            newHour = "0" + String.valueOf(this.hour);
        else {
            newHour = String.valueOf(this.hour);
        }
        if (this.minute <= 9) {
            newMinute = "0" + String.valueOf(this.minute);
        } else {
            newMinute = String.valueOf(this.minute);
        }
        if (this.second <= 9) {
            newSecond = "0" + String.valueOf(this.second);
        } else {
            newSecond = String.valueOf(this.second);
        }
        return newHour + ":" + newMinute + ":" + newSecond;
    }

    public Time nextSecond() {
        if (this.second <= 58) {
            this.second += 1;
        }
        else {
            this.second -= 59;
            if (this.minute <= 58) {
                this.minute += 1;
            }
            else {
                this.minute -= 59;
                if (this.hour <= 22) {
                    this.hour += 1;
                }
                else {
                    this.hour -= 23;
                }
            }

        }
        return this;
    }

    public Time previousSecond() {
        if (this.second >= 1) {
            this.second -= 1;
        }
        else {
            this.second += 59;
            if (this.minute >= 1) {
                this.minute -= 1;
            }
            else {
                this.minute += 59;
                if (this.hour >= 1) {
                    this.hour -= 1;
                }
                else {
                    this.hour += 23;
                }
            }
        }
        return this;
    }
}
