package com.alter.rohit.calculator;

public class JavaComaprisonOperator {
    public static void main(String[] args) {
        JavaComaprisonOperator jco = new JavaComaprisonOperator();
        jco.compare();
        jco.logic();


    }
    public  void compare() {
        int a, b;
        a = 12;
        b = 12;
        if (a > b) {
            System.out.println("a is greater than b");

        } else if (a < b) {
            System.out.println("a is less than b");

        } else if (a >= b) {
            System.out.println("a is greater than or equal to b");

        } else if (a <= b) {
            System.out.println("a is less than or equal to b");

        } else if (a != b) {
            System.out.println("a is not equal to b");

        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("Lear Properly the difference ");
        }
    }

        public void logic(){
            int x , y;
            x = 140; y = 20;
            if(x<5 && x<10){
                System.out.println("Return True  if both are true"+x);
            }
            else if(y<5 || y<4){
                System.out.println("Returns true if one of the statements is true"+y);
            }
            else if (!(x<5 && x<10)){
                System.out.println("Reverse the result, returns false if the result is true"+x);
            }
            else {
                System.out.println("Learn Logical Operator Properly");
            }
        }
    }

