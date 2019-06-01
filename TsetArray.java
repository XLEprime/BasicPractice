package com.example.basicpractice;

/**
 * Demo class
 *
 * @author __XLE
 */
public class TsetArray
{
    public static void main(String[] args)
    {
        double[] d = new double[100];

        int limit = 100;
        for (int i = 0; i < limit; i++)
        {
            d[i] = i + 1;
        }


        for (double element : d)
        {
            System.out.printf("%.2f%n", element);
        }
        /*
        for (int i= 0; i < d.length; i++)
        {
            System.out.printf("%.2f%n",d[i]);
        }
        */
        /*
        System.out.println(Arrays.toString(d));
        */
    }


}
