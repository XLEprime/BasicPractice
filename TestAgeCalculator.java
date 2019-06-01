package com.example.basicpractice;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Demo class
 *
 * @author __XLE
 */

public class TestAgeCalculator
{
    int year;
    int month;
    int day;

    int years;
    int months;
    int days;

    int yearNow;
    int monthNow;
    int dayNow;

    boolean judgement = true;
    public static void main(String[] args) {
        new TestAgeCalculator();
    }

    public TestAgeCalculator()
    {
        getData();

        getAge(year,month,day);

        if (judgement)
        {
            System.out.println(years + "岁零" + months + "个月" + days + "天");
        }
        else
            {
                System.out.println("you haven't been born now!!!");
            }

    }

    public void getData()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the year of your birthday?");
        year = in.nextInt();

        System.out.print("What is the month of your birthday?");
        month = in.nextInt();

        System.out.print("What is the day of your birthday?");
        day = in.nextInt();
    }

    public void getAge(int year, int month, int day)
    {

        Calendar calendar = Calendar.getInstance();

        yearNow = calendar.get(Calendar.YEAR);
        monthNow = calendar.get(Calendar.MONTH)+1;
        dayNow = calendar.get(Calendar.DAY_OF_MONTH);

        if (dayNow < day)
        {
            dayNow = dayNow + 30;
            monthNow = monthNow - 1;
        }
        if (monthNow < month)
        {
            monthNow = monthNow + 12;
            yearNow = yearNow - 1;
        }
        if (yearNow < year)
        {
            judgement = false;
        }
        if (judgement)
        {
            years = yearNow - year;
            months = monthNow - month;
            days = dayNow - day;
        }

    }





}