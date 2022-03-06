package com.alter.rohit.calculator;

import java.util.Scanner;

public class OperatorinJava {
    public static void main(String[] args) {
        OperatorinJava oj = new OperatorinJava();
        System.out.println("The addition is : "+oj.add(2,3));
        System.out.println("The Subtraction is : "+oj.Sub(2,3));
        System.out.println(oj.Ampersand(3,4));
        System.out.println(oj.Modulo(4,7));
        System.out.println(oj.Div(7,8));
        System.out.println(oj.Exponential(2,4));
        System.out.println(oj.Mul(3,3));
        System.out.println(oj.Greater(4,8));
        System.out.println(oj.Pipe(3,7));

    }

    public int add(int a, int b){
        int c = 0;
        c = a+b;
        return c;

    }

    public int Sub(int a, int b){
        int c = 0;
        c = a-b;
        return c;

    }
    public int Mul(int a, int b){
        int c = 0;
        c = a*b;
        return c;
    }
    public int Div(int a, int b){
        int c = 0;
        c = a/b;
        return c;

    }
    public int Modulo(int a, int b){
        int c = 0;
        c = a%b;
        return c;
    }
    public int Ampersand(int a, int b){
        int c = 0;
        c = a%=b;
        return c;
    }
    public int Pipe(int a, int b){
        int c = 0;
        c = a/=b;
        return c;
    }

    public int Exponential(int a, int b){
        int c = 0;
        c = a^b;
        return c;
    }
    public int Greater(int a, int b){
        int c = 0;
        c = a>>=b;
        return c;
    }

    public int Less(int a, int b){
        int c = 0;
        c = a<<=b;
        return c;
    }
}
