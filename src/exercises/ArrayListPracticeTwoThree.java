package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeTwoThree {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();

        stringArr.add("hi");
        stringArr.add("hey");
        stringArr.add("hello");
        stringArr.add("howdy");
        stringArr.add("salutations");

        wordListPrint(stringArr);
        }

    public static void wordListPrint(ArrayList<String> wordList){
        Scanner input = new Scanner(System.in);
        System.out.println("Letters in word:");
        int wordLength = input.nextInt();
        for (String word : wordList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
