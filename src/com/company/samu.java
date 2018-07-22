package com.company;

public class samu extends human{
    @Override
    public void walks() {
        System.out.println("walks slow ");
    }

    @Override
    public void runs() {
        System.out.println("runs fast ");
    }

    @Override
    public void eats() {
        System.out.println("eats cake ");
    }
}
