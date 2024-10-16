import java.util.Scanner;

public class MadLibsRevised {
    public static void main(String[] args) {
        //create scanner
            Scanner input = new Scanner(System.in);
            //things checked for: noun, plural noun, verb, adverb, adjective, number
            //madlib string variables
            String madLibOne = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
            boolean inMadLibOne = true;
            String madLibTwo = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
            boolean inMadLibTwo = false;
            String madLibThree = "In a faraway <noun>, a <adjective> king <verb> over the land.";
            boolean inMadLibThree = false;

            while (inMadLibOne == true) {
                int indexOfStartTag = madLibOne.indexOf("<");
                int indexOfEndTag = madLibOne.indexOf(">");
                String tagFound = (madLibOne.substring(indexOfStartTag, (indexOfEndTag + 1)));
                boolean tagIsNoun = tagFound.equals("<noun>");
                boolean tagIsPluralNoun = tagFound.equals("<plural_noun>");
                boolean tagIsVerb = tagFound.equals("<verb>");
                boolean tagIsAdverb = tagFound.equals("<adverb>");
                boolean tagIsAdjective = tagFound.equals("<adjective>");
                boolean tagIsNumber = tagFound.equals("<number>");
                if (tagIsNoun == true) {
                    System.out.println("Please type a noun: ");
                    String nounChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + nounChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsNoun = false;
                    indexOfStartTag = madLibOne.indexOf("<");
                    indexOfEndTag = madLibOne.indexOf(">");
                }
                if (tagIsPluralNoun == true) {
                    System.out.println("Please type a plural noun: ");
                    String pluralNounChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + pluralNounChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsPluralNoun = false;
                    indexOfStartTag = madLibOne.indexOf("<");
                    indexOfEndTag = madLibOne.indexOf(">");
                }
                if (tagIsNumber == true) {
                    System.out.println("Please type a number (as a word!): ");
                    String numberChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + numberChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsNumber = false;
                    indexOfStartTag = madLibOne.indexOf("<");
                    indexOfEndTag = madLibOne.indexOf(">");
                }
                if (tagIsAdverb == true) {
                    System.out.println("Please type an adverb: ");
                    String adverbChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + adverbChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsAdverb = false;
                    indexOfStartTag = madLibOne.indexOf("<");
                    indexOfEndTag = madLibOne.indexOf(">");
                }
                if (tagIsAdjective == true) {
                    System.out.println("Please type an adjective: ");
                    String adjectiveChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + adjectiveChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsAdverb = false;
                    indexOfStartTag = madLibOne.indexOf("<");
                    indexOfEndTag = madLibOne.indexOf(">");
                }
                if (tagIsVerb == true) {
                    System.out.println("Please type a verb: ");
                    String verbChosen = input.nextLine();
                    madLibOne = (madLibOne.substring(0, indexOfStartTag) + verbChosen + " " + madLibOne.substring(indexOfEndTag + 1));
                    System.out.println(madLibOne);
                    tagIsAdverb = false;
                }
            }

    }
}
