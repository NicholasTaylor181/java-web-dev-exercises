package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeOne {

    public static void main(String[] args) {

        ArrayList<Integer> numArr = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            numArr.add(i);
        }
        System.out.println(sumOfEven(numArr));
    }
    public static int sumOfEven(ArrayList<Integer> nums){
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum = num + sum;
            }
        }
        return sum;
    }
}
