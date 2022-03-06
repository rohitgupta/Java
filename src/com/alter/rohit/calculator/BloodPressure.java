package com.alter.rohit.calculator;

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        BloodPressure bp = new BloodPressure();
        bp.PressureCheckSystolic(120);
        bp.PressureCheckDiastolic(60);

    }

    public void PressureCheckSystolic(double Spressure) {

        if (Spressure < 120) {
            System.out.println("Enjoy ");
            System.out.println("Systolic Blood Pressure  is Normal");
        } else if (Spressure <= 120 || Spressure <= 139) {
            System.out.println("Moderate Start Dieting.");
            System.out.println("Systolic Blood Pressure at Risk (Pre Hypertension)");
        } else if (Spressure >= 140) {
            System.out.println("Start Taking Precaution.");
            System.out.println("!!Systolic!!High Blood Pressure (Hypertension)!!!");
        } else {
            System.out.println("You are Normal");

        }

    }
        public void PressureCheckDiastolic(double Dpressure){
            if(Dpressure <80){
                System.out.println("Enjoy ");
                System.out.println("Diastolic Blood Pressure  is Normal");
            }
            else if(Dpressure == 80 || Dpressure == 89){
                System.out.println("Start Taking Precaution.");
                System.out.println("!!Diastolic!!High Blood Pressure (Hypertension)!!!");
            }
            else if (Dpressure >= 90){
                System.out.println("Start Taking Precaution.");
                System.out.println("!Diastolic!!!High Blood Pressure (Hypertension)!!!");
            }
            else{
                System.out.println("Bhai you are Good Enjoy Life");

            }


        }


}
