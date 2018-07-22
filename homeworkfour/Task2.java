package homeworkfour;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 6, 7, 5, 8, 9, 5, 1, 9, 3, 4, 11, 11};

        for (int i = 0; i < array.length; i++) {
            int temporary = array[i];
            for (int j = 0; j < array.length-1; j++) {
                if (array[j + 1] == temporary) {
                    array[j + 1] = 0;
                }
            }

            array[i] = temporary;
        }

        System.out.println(Arrays.toString(array));
    }
}
