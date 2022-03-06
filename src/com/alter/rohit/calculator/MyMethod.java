package com.alter.rohit.calculator;

public class MyMethod {
    static void myStaticMethod(){
        System.out.println("Static Method can be called without creating an Object.");
    }

    public void myPublicMethod(){
        System.out.println("Public method is called by creating Object.");
    }

    public static void main(String[] args) {
        myStaticMethod();
        MyMethod mm = new MyMethod();
        mm.myPublicMethod();
    }
}
