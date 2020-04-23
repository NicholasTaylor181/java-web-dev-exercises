package exercises;

public class ArrayPracticeOneTwo {
    public static void main(String[] args) {
        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < 6; i++) {
            if (practiceArray[i] % 2 == 1) {
                System.out.print(practiceArray[i]);
            }
        }
    }
}


