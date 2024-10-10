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

        //test cases operation
        System.out.println("Here are some test cases with unique numbers. ");
        //positive integer
        System.out.println("Test case: 5");
        double alphaFirstManipulation = 5 * 2;
        System.out.println(5 + " * 2 = " + alphaFirstManipulation);
        double alphaSecondManipulation = alphaFirstManipulation + 6;
        System.out.println(alphaFirstManipulation + " + 6 = " + alphaSecondManipulation);
        double alphaThirdManipulation = alphaSecondManipulation / 2;
        System.out.println(alphaSecondManipulation + " / 2 = " + alphaThirdManipulation);
        double alphaFourthManipulation = alphaThirdManipulation - 5;
        System.out.println(alphaThirdManipulation + " - " + 5 + " = " + alphaFourthManipulation);
        System.out.println("");
        
        //negative integer
        System.out.println("Test case: -5");
        double betaFirstManipulation = -5 * 2;
        System.out.println(-5 + " * 2 = " + betaFirstManipulation);
        double betaSecondManipulation = betaFirstManipulation + 6;
        System.out.println(betaFirstManipulation + " + 6 = " + betaSecondManipulation);
        double betaThirdManipulation = betaSecondManipulation / 2;
        System.out.println(betaSecondManipulation + " / 2 = " + betaThirdManipulation);
        double betaFourthManipulation = betaThirdManipulation - (-5);
        System.out.println(betaThirdManipulation + " - " + -5 + " = " + betaFourthManipulation);
        System.out.println("");

        //positive double
        System.out.println("Test case: 6.5");
        double gammaFirstManipulation = 6.5 * 2;
        System.out.println(6.5 + " * 2 = " + gammaFirstManipulation);
        double gammaSecondManipulation = gammaFirstManipulation + 6;
        System.out.println(gammaFirstManipulation + " + 6 = " + gammaSecondManipulation);
        double gammaThirdManipulation = gammaSecondManipulation / 2;
        System.out.println(gammaSecondManipulation + " / 2 = " + gammaThirdManipulation);
        double gammaFourthManipulation = gammaThirdManipulation - 6.5;
        System.out.println(gammaThirdManipulation + " - " + 6.5 + " = " + gammaFourthManipulation);
        System.out.println("");

        //negative double
        System.out.println("Test case: -6.5");
        double deltaFirstManipulation = -6.5 * 2;
        System.out.println(-6.5 + " * 2 = " + deltaFirstManipulation);
        double deltaSecondManipulation = deltaFirstManipulation + 6;
        System.out.println(deltaFirstManipulation + " + 6 = " + deltaSecondManipulation);
        double deltaThirdManipulation = deltaSecondManipulation / 2;
        System.out.println(deltaSecondManipulation + " / 2 = " + deltaThirdManipulation);
        double deltaFourthManipulation = deltaThirdManipulation - (-6.5);
        System.out.println(deltaThirdManipulation + " - " + -6.5 + " = " + deltaFourthManipulation);
        System.out.println("");
        
        //zero
        System.out.println("Test case: 0");
        double epsilonFirstManipulation = 0 * 2;
        System.out.println(0 + " * 2 = " + epsilonFirstManipulation);
        double epsilonSecondManipulation = epsilonFirstManipulation + 6;
        System.out.println(epsilonFirstManipulation + " + 6 = " + epsilonSecondManipulation);
        double epsilonThirdManipulation = epsilonSecondManipulation / 2;
        System.out.println(epsilonSecondManipulation + " / 2 = " + epsilonThirdManipulation);
        double epsilonFourthManipulation = epsilonThirdManipulation - 0;
        System.out.println(epsilonThirdManipulation + " - " + 0 + " = " + epsilonFourthManipulation);
        System.out.println("");

        //one
        System.out.println("Test case: 1");
        double zetaFirstManipulation = 1 * 2;
        System.out.println(1 + " * 2 = " + zetaFirstManipulation);
        double zetaSecondManipulation = zetaFirstManipulation + 6;
        System.out.println(zetaFirstManipulation + " + 6 = " + zetaSecondManipulation);
        double zetaThirdManipulation = zetaSecondManipulation / 2;
        System.out.println(zetaSecondManipulation + " / 2 = " + zetaThirdManipulation);
        double zetaFourthManipulation = zetaThirdManipulation - 1;
        System.out.println(zetaThirdManipulation + " - " + 1 + " = " + zetaFourthManipulation);
        System.out.println("");

        //edge case
        System.out.println("Test case: 0.99999");
        double etaFirstManipulation = 0.99999 * 2;
        System.out.println(0.99999 + " * 2 = " + etaFirstManipulation);
        double etaSecondManipulation = etaFirstManipulation + 6;
        System.out.println(etaFirstManipulation + " + 6 = " + etaSecondManipulation);
        double etaThirdManipulation = etaSecondManipulation / 2;
        System.out.println(etaSecondManipulation + " / 2 = " + etaThirdManipulation);
        double etaFourthManipulation = etaThirdManipulation - 0.99999;
        System.out.println(etaThirdManipulation + " - " + 0.99999 + " = " + etaFourthManipulation);

    }
 }