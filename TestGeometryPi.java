package com.example.basicpractice;

/**
 * Demo class
 *
 * @author __XLE
 */

public class TestGeometryPi {

    public static void main(String[] args)
    {
        double limit = 1000000;
        double n = 0;

        for (int i= 0; i < limit; i++)
        {
            double x = Math.random();
            double y = Math.random();
            if (x != 0 && x != 0)
            {
                double d = Math.sqrt(x * x + y * y);
                if (d <= 1)
                {
                    n++;
                }
            }
            else
            {
                n++;
            }

        }
        double p = 4*n/limit;
        System.out.println(p);
    }

}
