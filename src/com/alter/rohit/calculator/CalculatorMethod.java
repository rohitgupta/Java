package com.alter.rohit.calculator;

public class CalculatorMethod {
    public static void main(String[] args) {
        CalculatorMethod cal = new CalculatorMethod();
        System.out.println("The addition is :"+cal.add(3,3));
        System.out.println("The Multiplication is :"+cal.Multiply(3,3));
        System.out.println("The Division is :"+cal.Division(4,4));
        System.out.println("The Modulus is :"+cal.Mod(5,7));
        System.out.println("The Subtraction is :"+cal.Sub(5,8));
    }
    public int add(int x, int y){
        int z = 0;
         z =  x+y;
        return z;
    }
    public int Sub(int x , int y){
        int z = 0;
        return z = x-y;
    }
    public int Multiply(int x, int y){
        int z = 0;
        return z = x*y;
    }
    public int Division(int x, int y){
        int z = 0;
        return z = x/y;
    }
    public int Mod(int x , int y){
        int z = 0;
        return z =  x%y;
    }
}
