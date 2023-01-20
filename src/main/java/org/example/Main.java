package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //create a scanner class object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter number and store them in variable
        System.out.println("Please enter first number");
        double firstNum = scanner.nextInt();
        System.out.println("Please enter second number");
        double secondNum = scanner.nextInt();
        //ask user to enter operator variable for store result
        System.out.println("Please choose operator +, -, /, *");
        char operator = scanner.next().charAt(0);
        // variable for store result
        double result;

        //Use Switch-case
        switch (operator) {

            //Addition between number
            case '+':
                result = firstNum + secondNum;
                System.out.println("Addition" + result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.println("Subtraction of number =" + result);
                break;
            case '/':
                result = firstNum / secondNum;
                System.out.println("Division  of number =" + result);
                break;

            case '*':
                result = firstNum * secondNum;
                System.out.println("multiplication of number =" + result);
                break;


        }


    }
}