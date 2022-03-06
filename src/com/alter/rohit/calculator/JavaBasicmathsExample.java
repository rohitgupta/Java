package com.alter.rohit.calculator;

public class JavaBasicmathsExample {
    public static void main(String[] args) {
        JavaBasicmathsExample Maths = new JavaBasicmathsExample();
        System.out.println("The Max of "+Maths.Max(4,5));
        System.out.println("The Min of "+Maths.Min(4,5));
        System.out.println("The abs of "+Maths.abs(-5.5));
        Maths.Rand();
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isFishTasty);
        System.out.println(isJavaFun);

    }
    public int Max(int a , int b){
        return Math.max(a,b);
    }

    public int Min(int a , int b){
        return Math.max(a,b);
    }

    public double abs(double a){
        return Math.abs(a);
    }
    public void Rand(){
        int number;
        number = (int)(Math.random()*1000);
        System.out.println("The Random Number is  : " +number);
    }

}
