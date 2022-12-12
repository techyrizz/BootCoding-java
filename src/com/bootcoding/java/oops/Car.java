package com.bootcoding.java.oops;

public class Car {
    String color;
    String model;
    String brandName;
    String engine;
    String carOwner;
    int lights;
    int seats;
    String fuelType;

    public void startEngine(){

        System.out.println("Engine Started ");
    }
    public void stopEngine(){

        System.out.println("Engine Stopped ");
    }
    public void move(){

        System.out.println("Car is moving");
    }
    public void print(){
        System.out.println("Car Owner = " + carOwner);
        System.out.println("Car Brand Name = " + brandName);
        System.out.println("Car Model = " + model);
        System.out.println("Car Engine Type = " + engine);
        System.out.println("Car Fuel Type = " + fuelType);
        System.out.println("Car Color = " + color);
        System.out.println("Car Lights = " + lights);
        System.out.println("Car Seats = " + seats);





    }

}
