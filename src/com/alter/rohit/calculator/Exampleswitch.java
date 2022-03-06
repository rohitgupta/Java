package com.alter.rohit.calculator;

import java.time.Month;

public class Exampleswitch {
    public static void main(String[] args) {
        Exampleswitch cal = new Exampleswitch();
        cal.Calendar();

    }
    public void Calendar(){
        int day = 16;
        if(day <=12){
            switch (day) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Looking forward to the Weekend");
            }
        }
        else {
            System.out.println("Error Invalid Number .");
            System.out.println("Number Accepted Between 1 to 12 only.");
        }

    }

}

