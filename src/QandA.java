import java.io.Console;

public class QandA {

    public static void main(String[] args) {
        Console console = System.console();
        /*  Doesn't run in IDE
            verb - An action
            adjective - A description used to modify or describe a noun
        */

        ///////////////////////////////////////////////////////////////////////////
        // A simple Q & A program that only works if the user is over 13
        // can be extended easily - added word censorship checking
        // could build a list of bad words and use the method contains() but my list is only 2 words
        String intAsString = console.readLine("How old are you? ");
        int age = Integer.parseInt(intAsString);
        boolean isInvalidWord;
        String adjective;
        if (age > 13) {
            String name = console.readLine("Enter your name?  ");
            do {
                adjective = console.readLine("Enter an adjective?  ");
                isInvalidWord = (adjective.equalsIgnoreCase("badword")) ||
                                (adjective.equalsIgnoreCase("anotherbadword"));
                if (isInvalidWord) {
                    System.out.println("Sorry that word is not allowed. Try again");
                }
            } while (isInvalidWord);
            String verb = console.readLine("Enter a verb?  ");
            console.printf("%s is very %s while %s!", name, adjective, verb);
        } else {
            System.out.println("Sorry you are too young for this program.");
            System.exit(0);
        }
        /////////////////////////////////////////////////////////////////////////////
    }
}
