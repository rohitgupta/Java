package com.alter.rohit.calculator;
/* Write a Program to print Even and Odd Number*/
public class EvenOddProgram {

    public static void main(String[] args) {
        EvenOddProgram eo = new EvenOddProgram();
        eo.Odd();
        eo.Even();
    }
    public void Odd(){
        for (int i = 1;i<10;i=i+2){
            System.out.println("The odd Number are as follow");
            System.out.println(i);
        }
    }
    public void Even(){
        for(int j = 0;j<10;j= j+2){
            System.out.println("The Even Number");
            System.out.println(j);
        }
    }
}
