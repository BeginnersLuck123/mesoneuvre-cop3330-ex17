package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = input.nextInt();//Input
        System.out.println("How many ounces of alcohol did you have?");
        double ounces = input.nextDouble();//Input
        System.out.println("What is your weight, in pounds?");
        double pounds = input.nextDouble();//Input
        System.out.println("How many hours has it been since your last drink?");
        double hours = input.nextDouble();//Input
        double BAC;
        //IF/ELSE statement using the Blood Alcohol Calculator to determine alcohol level in user
        if(gender == 1)
        {
            BAC = ounces * 5.14/pounds*.73;
            BAC = BAC - .015 * hours;
        }
        else
        {
            BAC = ounces * 5.14/pounds*.66;
            BAC = BAC - .015 * hours;
        }
        System.out.println("Your BAC is " + BAC + ".");
        //IF/ELSE statement to see if user is able to legally drive based on Blood Alcohol Calculator
        if(BAC >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");//Output
        }
        else
        {
            System.out.println("It is legal for you to drive.");//Output
        }
    }
}
