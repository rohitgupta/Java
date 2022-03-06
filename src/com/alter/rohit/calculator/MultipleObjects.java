package com.alter.rohit.calculator;

public class MultipleObjects {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjects mo1 = new MultipleObjects();
        MultipleObjects mo2 = new MultipleObjects();
        System.out.println(mo1.x);
        System.out.println(mo2.x);
        mo2.x = 25;
        System.out.println(mo2.x);
    }
}
