package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Duck duck = new Duck();
     Bird bird = new Bird();

     System.out.print("Duck: ");
     duck.born();
     System.out.print("Bird: ");
     bird.born();

     System.out.println(" ");
     
     duck.swim();
     bird.swim();

    }

}

