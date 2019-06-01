package com.example.basicpractice;

import java.util.Date;

/**
 * Demo class
 *
 * @author __XLE
 */

public class TsetStringTime
{
    public static void main(String[] args)
    {
        System.out.printf("%Tc%n", new Date());
        System.out.printf("%TF%n", new Date());
        System.out.printf("%TD%n", new Date());
        System.out.printf("%TT%n", new Date());
    }


}
