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
                //find tag
                int indexOfStartTag = madLibOne.indexOf("<");
                int indexOfEndTag = madLibOne.indexOf(">");
                
                //start modifying string
                System.out.println("Please type a " + madLibOne.substring(indexOfStartTag + 1, indexOfEndTag) + ":");
                String wordChosen = input.nextLine();
                madLibOne = (madLibOne.substring(0, indexOfStartTag) + wordChosen + madLibOne.substring(indexOfEndTag + 1));
                System.out.println(madLibOne);
                indexOfStartTag = madLibOne.indexOf("<");
                indexOfEndTag = madLibOne.indexOf(">"); 
                if (indexOfStartTag == -1) {
                    inMadLibOne = false;
                    break;
                }
                
            }
        input.close();
    }
}
