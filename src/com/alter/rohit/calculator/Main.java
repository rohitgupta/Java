package com.alter.rohit.calculator;

public class Main {
   final int x = 5;//The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
    int y = 3;
    public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
    //myObj.x = 40;
    System.out.println(myObj.x);
    System.out.println(myObj.y);
    myObj.y = 80;
    System.out.println(myObj.y);
    }
}
