package homeworkfour;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        step(array);

        System.out.println(Arrays.toString(array));
        }

    private static void step(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}


