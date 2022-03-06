package com.alter.rohit.calculator;
/* Write a Program to print Even and Odd Number*/
public class EvenOddProgram {

    public static void main(String[] args) {
        EvenOddProgram eo = new EvenOddProgram();
        eo.Odd();
        eo.Even();
    }
    public void Odd(){
        for (int i = 1;i<100;i=i+2){
            System.out.println("The odd Number are as follow");
            if(i==77){
                System.out.println("The loop is break.");
                break;
            }
            System.out.println(i);
        }
    }
    public void Even(){
        for(int j = 0;j<200;j= j+2){
            System.out.println("The Even Number");
            if(j==100){
                System.out.println("The loop continue");
                continue;
            }
            System.out.println(j);
        }
    }
}
