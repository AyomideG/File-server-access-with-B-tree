/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mide_
 */
public class FileName {

    int patientID;
    int month, day, year;
    int hour, minute, second;
    int imageCode;

    public FileName() {
    }

    //creates random patients id.
    public int getPatientID() {
        patientID = randBetween(9999900, 9999999);
        return patientID;
    }

    //creates a random month the image scan was take.
    public String getMonth() {
        month = randBetween(1, 12);
        int value = month;
        return String.format("%02d", value);
    }

    //creates a random day the image scan was take.
    public String getDay() {
        day = randBetween(1, 31);
        int value = day;
        return String.format("%02d", value);
    }

    //creates a random year the image scan was take.
    public String getYear() {
        year = randBetween(1, 12);
        int value = year;
        return String.format("%02d", value);
    }

    //gets the vale for month, day and year to create the date.
    public String getDate() {
        return getMonth() + "" + getDay() + "" + getYear();
    }

    //creates a random hour the image scan was take.
    public String getHour() {
        hour = randBetween(1, 24);
        int value = hour;
        return String.format("%02d", value);
    }

    //creates a random minute the image scan was take.
    public String getMinute() {
        minute = randBetween(1, 60);
        int value = minute;
        return String.format("%02d", value);
    }

    //creates a random second the image scan was take.
    public String getSecond() {
        second = randBetween(1, 60);
        int value = second;
        return String.format("%02d", value);
    }

    //gets the vale for hour, minute and second to create the time.
    public String getTime() {
        return getHour() + "" + getMinute() + "" + getSecond();
    }

    //creates a random image code.
    public int getImageCode() {
        imageCode = randBetween(1000000, 9999999);
        return imageCode;
    }

    //creates the file name from the patient id, date, time, ., and image code.
    public String getFileName() {
        return getPatientID() + getDate() + getTime() + "." + getImageCode();
    }

    //random method to generate numbers in a certain range start to stop.
    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}