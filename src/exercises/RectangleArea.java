package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Height of rectangle:");
        double height = input.nextDouble();
        System.out.println("Length of rectangle:");
        double length = input.nextDouble();
        System.out.println(height * length);
    }
}
