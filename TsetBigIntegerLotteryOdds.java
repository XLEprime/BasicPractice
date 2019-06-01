package com.example.basicpractice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Demo class
 *
 * @author __XLE
 */

public class TsetBigIntegerLotteryOdds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        BigInteger lottertOdds = BigInteger.valueOf(1);

        for (int i = 1;i <= k; i++)
        {
            lottertOdds = lottertOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lottertOdds + ". Good luck! Have fun!");
    }


}
