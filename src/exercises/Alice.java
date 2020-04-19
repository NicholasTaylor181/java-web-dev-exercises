package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String quote = "\n" +
                "\n" +
                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";
         System.out.println(quote);
         Scanner input = new Scanner(System.in);
         System.out.println("Search term thats in quote:");
         String term = input.nextLine();
        if (quote.toLowerCase().contains(term.toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
