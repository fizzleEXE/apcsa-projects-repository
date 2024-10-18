/* Name: Madden Ortiz
 * Date: 10/17/2024
 * Assignment: Mad Lib Project
 * Version: 1
 */

import java.util.Scanner;

public class MadLibsRevised {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        // things checked for: noun, plural noun, verb, adverb, adjective, number
        // madlib string variables
        String madLibOne = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        boolean inMadLibOne = true;
        String madLibTwo = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        boolean inMadLibTwo = false;
        String madLibThree = "In a faraway <noun>, a <adjective> king <verb> over the land.";
        boolean inMadLibThree = false;
        String madLibFour = "";
        boolean inMadLibFour = false;

        //tag related
        int indexOfStartTag;
        int indexOfEndTag;
        String wordChosen;


        while (inMadLibOne == true) {
            // find tag
            indexOfStartTag = madLibOne.indexOf("<");
            indexOfEndTag = madLibOne.indexOf(">");

            // start modifying string
            if (indexOfStartTag == -1) {
                System.out.println(madLibOne);
                inMadLibOne = false;
                inMadLibTwo = true;
                break;
            }
            System.out.println("Please type a " + madLibOne.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
            wordChosen = input.nextLine();
            if (wordChosen.indexOf("<") > -1 || wordChosen.indexOf(">") > -1) {
                System.out.println("Do not include brackets. Try again.");
                continue;
            }
            madLibOne = (madLibOne.substring(0, indexOfStartTag) + wordChosen + madLibOne.substring(indexOfEndTag + 1));
            indexOfStartTag = madLibOne.indexOf("<");
            indexOfEndTag = madLibOne.indexOf(">");
        }
        while (inMadLibTwo == true) {
            // find tag
            indexOfStartTag = madLibTwo.indexOf("<");
            indexOfEndTag = madLibTwo.indexOf(">");

            // start modifying string
            if (indexOfStartTag == -1) {
                System.out.println(madLibTwo);
                inMadLibTwo = false;
                inMadLibThree = true;
                break;
            }
            System.out.println("Please type a " + madLibTwo.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
            wordChosen = input.nextLine();
            if (wordChosen.indexOf("<") > -1 || wordChosen.indexOf(">") > -1) {
                System.out.println("Do not include brackets. Try again.");
                continue;
            }
            madLibTwo = (madLibTwo.substring(0, indexOfStartTag) + wordChosen
                    + madLibTwo.substring(indexOfEndTag + 1));
            indexOfStartTag = madLibTwo.indexOf("<");
            indexOfEndTag = madLibTwo.indexOf(">");
        }
        while (inMadLibThree == true) {
            // find tag
            indexOfStartTag = madLibThree.indexOf("<");
            indexOfEndTag = madLibThree.indexOf(">");

            // start modifying string
            if (indexOfStartTag == -1) {
                System.out.println(madLibThree);
                inMadLibThree = false;
                inMadLibFour = true;
                break;
            }
            System.out.println("Please type a " + madLibThree.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
            wordChosen = input.nextLine();
            if (wordChosen.indexOf("<") > -1 || wordChosen.indexOf(">") > -1) {
                System.out.println("Do not include brackets. Try again.");
                continue;
            }
            madLibThree = (madLibThree.substring(0, indexOfStartTag) + wordChosen
                    + madLibThree.substring(indexOfEndTag + 1));
            indexOfStartTag = madLibThree.indexOf("<");
            indexOfEndTag = madLibThree.indexOf(">");
        }

        //get madlib from user
        System.out.println("\nLet's try using your own Mad Lib!");
        System.out.println("Type your madlib. Please make to include at least one tag formatted as <tag>: ");
        madLibFour = input.nextLine();

        while (inMadLibFour == true) {
            // find tag
            indexOfStartTag = madLibFour.indexOf("<");
            indexOfEndTag = madLibFour.indexOf(">");

            // start modifying string
            if (indexOfStartTag == -1) {
                System.out.println(madLibFour);
                inMadLibFour = false;
                break;
            }
            System.out.println("Please type a " + madLibFour.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
            wordChosen = input.nextLine();
            if (wordChosen.indexOf("<") > -1 || wordChosen.indexOf(">") > -1) {
                System.out.println("Do not include brackets. Try again.");
                continue;
            }
            madLibFour = (madLibFour.substring(0, indexOfStartTag) + wordChosen + madLibFour.substring(indexOfEndTag + 1));
            indexOfStartTag = madLibFour.indexOf("<");
            indexOfEndTag = madLibFour.indexOf(">");
        }
        input.close();
    }
}
