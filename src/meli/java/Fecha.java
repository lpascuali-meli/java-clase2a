package meli.java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha() {

    }

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        if (this.day <= 0 || this.month <= 0 || this.year <= 0) {
            return false;
        } else if (this.month > 12 || this.year > 9999) {
            return false;
        } else {
            int maxValue;
            switch (this.month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxValue = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxValue = 30;
                    break;
                case 2:
                    maxValue = this.year % 4 == 0 ? 29 : 28;
                    break;
                default:
                    maxValue = 31;
            }
            return this.day <= maxValue;
        }
    }

    public void addDay () {
        GregorianCalendar date = new GregorianCalendar(this.year, this.month, this.day);
        date.add(Calendar.DAY_OF_MONTH, 1);
        this.day  = date.get(Calendar.DAY_OF_MONTH);
        this.month = date.get(Calendar.MONTH);
        this.year = date.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return day +
                "/" + month +
                "/" + year;
    }
}
