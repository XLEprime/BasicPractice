package com.example.basicpractice;

import java.util.Scanner;

/**
 * Demo class
 *
 * @author __XLE
 */

public class TsetInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = in.nextLine();

        System.out.print("How old are you?");
        int age  = in.nextInt();

        System.out.println("Hello," + name + ". Next year,you will be " + (age + 1) + ".");
        /*
        System.out.printf("Hello,%s.Next year,you will be %d.",name,age+1);
        */
        /*
        String message = String.format("Hello,%s.Next year,you will be %d.",name,age+1);
        System.out.println(message);
        */
    }

}
