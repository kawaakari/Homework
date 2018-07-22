package homeworkfour;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] arrOne = {1, 3, 5, 7, 9, 11, 13, 14, 15, 16 };
        int lengthOne = arrOne.length;
        int[] arrTwo = {2, 4, 6, 8, 10, 12};
        int lengthTwo = arrTwo.length;
        int[] ultimateArray = new int[arrOne.length + arrTwo.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lengthOne && j < lengthTwo) {
            ultimateArray[k++] = arrOne[i++];
            ultimateArray[k++] = arrTwo[j++];
        }

        while (i < lengthOne) {
            ultimateArray[k++] = arrOne[i++];
        }



        while (j < lengthTwo) {
            ultimateArray[k++] = arrTwo[j++];
        }

        System.out.println(Arrays.toString(ultimateArray));
    }
}

