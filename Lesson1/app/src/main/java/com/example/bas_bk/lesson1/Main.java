package com.example.bas_bk.lesson1;

/**
 * Created by BAS_BK on 19.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        int myNumber = 5;

        double d = 4.5;
        d = 3.0;

        float f = 4.5f;

        char c = 'g';

        String s1 = new String("Hello, World! ");
        String s2 = "Hello, World!!!";
        String s3 = s1+s2;

        int num = 5;
        String s = "I have " + num + " cookies";

        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b){
            System.out.println(toBe);
        }
        

        System.out.println(s);
    }
}
