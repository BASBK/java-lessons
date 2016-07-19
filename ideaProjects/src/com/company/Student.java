package com.company;

/**
 * Created by BAS_BK on 19.07.2016.
 */
public class Student {
    private String name;
    private String lastName;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void printFullName(){
        System.out.println(name + " " + lastName);
    }
}
