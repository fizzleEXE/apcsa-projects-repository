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
                break;
            }
            System.out.println("Please type a " + madLibThree.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
            wordChosen = input.nextLine();
            madLibThree = (madLibThree.substring(0, indexOfStartTag) + wordChosen
                    + madLibThree.substring(indexOfEndTag + 1));
            indexOfStartTag = madLibThree.indexOf("<");
            indexOfEndTag = madLibThree.indexOf(">");
        }
        input.close();
    }
}
