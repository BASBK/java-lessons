package com.company;

/**
 * Created by BAS_BK on 19.07.2016.
 */
public class Advice extends Thought{
    @Override
    public void message() {
        System.out.println("Yep, hello!");
        super.message();
    }
}
