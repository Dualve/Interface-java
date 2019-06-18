package com.company;

public interface Swimmable {
    public void swim();
    public default void born(){
        System.out.println("I was born.");
    }

}
