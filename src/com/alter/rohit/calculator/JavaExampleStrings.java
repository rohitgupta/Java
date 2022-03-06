package com.alter.rohit.calculator;

import java.util.Locale;

public class JavaExampleStrings {
    public static void main(String[] args) {
        JavaExampleStrings jes = new JavaExampleStrings();
        jes.Uppercase();
    }
    public void Uppercase(){
        String s1 = "rohit";
        String s2 = "GUPTA";

       String  s3 = s1.toUpperCase(Locale.ROOT);
        System.out.println(s3);
        String s4 = s2.toLowerCase(Locale.ROOT);
        System.out.println(s3);

        String s5 = s3.concat(s4);
        System.out.println(s5);
    }


}






