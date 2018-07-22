package com.company;

public class onu extends human {
    @Override
    public void walks() {
        System.out.println("walks fast ");
    }

    @Override
    public void runs() {
        System.out.println("runs slow");
    }

    @Override
    public void eats() {
        System.out.println("eats cake ");
    }
}
