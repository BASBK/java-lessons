package com.company;

/**
 * Created by BAS_BK on 19.07.2016.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);
    }

    public void printPoint(){
        scale(this);
        System.out.println("(" + x + " , " + y + ")");
    }

    private Point center(Point somePoint){
        return new Point((x+somePoint.x) / 2, (y + somePoint.y) / 2);
    }
    private Point scale(Point p){
        p.x = p.x / 2;
        p.y = p.y / 2;
        return p;
    }
}
