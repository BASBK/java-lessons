package com.company;

/**
 * Created by BAS_BK on 24.07.2016.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public double area(){
        return length * width;
    }
}
