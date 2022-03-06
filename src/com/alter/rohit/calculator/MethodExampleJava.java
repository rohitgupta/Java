package com.alter.rohit.calculator;

public class MethodExampleJava {

    public void Name(String fname, int age){
        System.out.println("The Name is :"+fname);
        System.out.println("The age is "+age);
    }

    public int add(int x){
        return 5+x;
    }


    public static void main(String[] args) {
        MethodExampleJava method = new MethodExampleJava();
        method.Name("Rohit",44);
        method.Name("Vikas",55);
        method.Name("Shukla",33);
        method.Name("Dongry",44);
        System.out.println("The total is "+method.add(6));
    }

}
