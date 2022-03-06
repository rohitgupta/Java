package com.alter.rohit.calculator;

public class WhileExampleJava {
    public static void main(String[] args) {
        WhileExampleJava dn = new WhileExampleJava();
        dn.DisplayNum();
        dn.DisplayNum1();
        dn.ForExample();
    }
    public void DisplayNum(){
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
    public void DisplayNum1(){
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }
        while (j<5);
    }


    public void ForExample(){
        for(int k = 0;k<10;k=k+3 ){
            System.out.println("The value of k is "+k);
        }
    }
}


