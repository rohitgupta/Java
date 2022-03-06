package com.alter.rohit.calculator;

public class ExampleArray {
    public static void main(String[] args) {
        ExampleArray ea  = new ExampleArray();
        ea.Car();
    }
    public void Car(){
        String [] cars = {"BMW","MARTI","Vertigo"};
        System.out.println("The car is :"+cars[0]);
        System.out.println("The length of the car is "+cars.length);

        int [] num = {1,2,3,4,5,6,7,8,9,0};
        for (int j : num) {
            System.out.println("The length of the array is :" + j);
        }
        //System.out.println("The Number is :"+num[5]);

        double [] num1 = {10.4,20.5,6.5,40.1,50.2,55.55,65.55};
        System.out.println("The Double Number is : "+num1[5]);
    }
}
