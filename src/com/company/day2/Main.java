package com.company.day2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //add two numbers
        int number1;  //declare number1
        int number2;  //declare number2
        int answer;   //declare answer

        number1 = 12;
        number2 = 30;

        System.out.println("Adding two numbers");
        answer = number1 + number2;
        System.out.println("The answer is : " + answer + "\n");

        //getting largest number
        System.out.println("getting largest number");
        if (number1 > number2) {
            System.out.println("Number1 is greater than number2\n");
        } else {
            System.out.println("Number2 is greater than number1\n");
        }

        //print 1-10 numbers
        System.out.println("print 1-10 numbers");
        int count;
        for (count = 1; count <= 10; count++) {
            System.out.println(count);
        }

        //array
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;

        //0 to 25 ,  Multiples of 5
        int[] multiplesOfFive = new int[6];
        int multiple = 0;
        for (count = 0; count < 6; count++) {
            multiplesOfFive[count] = multiple;
            multiple = multiple + 5;
        }
        //printing the array
        System.out.println("\nMultiples of 5 are: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(multiplesOfFive[i]);
        }



    }
}