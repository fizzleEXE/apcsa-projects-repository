/*
 * Name: Madden Ortiz
 * Date Created: 09/25/2024
 * Description: Uses operators to showcase a numbers riddle within Java
 */

import java.util.Scanner;

 public class NumbersRiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Intro text printing
        System.out.println("Welcome to the Numbers Riddle Program");
        System.out.println("Version 0.01");
        System.out.println();
        System.out.println("I'm going to show you a cool trick that will turn any number you type into three! ");
        System.out.println();
        System.out.println("Please type a number: ");
        
        //get user input as double
        Double userNumberInput = input.nextDouble();

        //begin performing operations and printing them
        input.close();
        double firstManipulation = userNumberInput * 2;
        System.out.println(userNumberInput + " * 2 = " + firstManipulation);
        double secondManipulation = firstManipulation + 6;
        System.out.println(firstManipulation + " + 6 = " + secondManipulation);
        double thirdManipulation = secondManipulation / 2;
        System.out.println(secondManipulation + " / 2 = " + thirdManipulation);
        double fourthManipulation = thirdManipulation - userNumberInput;
        System.out.println(thirdManipulation + " - " + userNumberInput + " = " + fourthManipulation);
    }
 }