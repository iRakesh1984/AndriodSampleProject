package com.example.anilkothari.secondapril;

/**
 * Created by anilkothari on 04/08/16.
 */
public class Car {

    private String make;
    private int year;
    private int idValue;
    private String condition;


    public Car(String make, int year, int id, String condition){
        super();
        this.make = make;
        this.year = year;
        this.idValue = id;
        this.condition = condition;

    }

    public String getMake() {
        return make;
    }

    public int getIdValue () {
        return idValue;
    }

    public int getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }

}
