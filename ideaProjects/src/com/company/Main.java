package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(1.2,2.9));
        Student s = new Student();
        s.setName("Вова");
        s.setLastName("Горохов");
        s.printFullName();


    }
    public static void foo(){

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
}
