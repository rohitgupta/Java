package com.alter.rohit.calculator;

public class MethodOverloadJava {

    static int Testadd(int x, int y){
       // int z = 0;
        return x+y;
       // return z;
    }

    static double Testadd(double x, double y){
      //  double z = 0;
        return  x+y;
       // return z;
    }
    public static void main(String[] args) {
        System.out.println("Example of Method Overloading");
        System.out.println("With method overloading, multiple methods can have the same name with different parameters");
        MethodExampleJava MethodJava = new MethodExampleJava();
        int myInt = Testadd(3,5);
        double myDouble = Testadd(4.6,0.5);
        System.out.println("The Integer value is "+myInt);
        System.out.println("The Double value is "+myDouble);



    }
}
