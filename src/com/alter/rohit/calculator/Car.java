package com.alter.rohit.calculator;

public class Car {

    public void Speed(int Speed){
        System.out.println("The Speed of the car is :"+Speed);

    }
    public void Color(){
        System.out.println("The color of the car is red.");
    }
    public void Tyre(int tyre){
        System.out.println("It has Tyre count :"+tyre);
    }
    public void FullThrottle(){
        System.out.println("The car is going as fast as i can.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.Color();
        c.Speed(200);
        c.Tyre(5);
        c.FullThrottle();
    }
}
