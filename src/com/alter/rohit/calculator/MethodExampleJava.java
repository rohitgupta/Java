package com.alter.rohit.calculator;

public class MethodExampleJava {

    public void Name(String fname){
        System.out.println("The Name is :"+fname);
    }

    public static void main(String[] args) {
        MethodExampleJava method = new MethodExampleJava();
        method.Name("Rohit");
        method.Name("Vikas");
        method.Name("Shukla");
        method.Name("Dongry");
    }

}
