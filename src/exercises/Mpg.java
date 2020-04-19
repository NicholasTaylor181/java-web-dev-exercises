package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven:");
        double miles = input.nextDouble();
        System.out.println("Gallons used:");
        double gallons = input.nextDouble();
        System.out.println("You averaged " + miles / gallons + " miles per gallon.");
    }
}
