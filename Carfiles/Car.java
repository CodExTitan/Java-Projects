package OopsLearnung.Carfiles;

import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    //below code is the example of creating a constructor
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }


    public String getmake() {
        return this.make;
    }

    public void setmake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String[] getparts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setparts(String[] parts) {
        this.parts = Arrays.copyOf(this.parts, this.parts.length);
    }

    public void drive() {
        System.out.println(getmake() + ": This is worth of $" + getPrice() + ", It is a new model of year " +
                getYear() + ". The color is " + getcolor() + " and the parts are " + Arrays.toString(getparts()) + ".");

    }
}



