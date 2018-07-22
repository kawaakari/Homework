package homeworkfour;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[][] bigBoss = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10, 11, 12}};

         System.out.println(Arrays.toString(linearize(bigBoss)));

    }

    private static int[] linearize(int[][] bigBoss) {

        int[] sectionOne = new int[bigBoss[0].length];
        int[] sectionTwo = new int[bigBoss[1].length];

        for (int i = 0; i < bigBoss[0].length; i++) {
            sectionOne[i] = bigBoss[0][i];
        }

        for (int j = 0; j < bigBoss[1].length; j++) {
            sectionTwo[j] = bigBoss[1][j];
        }

        int[] ultimateArray = new int[bigBoss[0].length + bigBoss[1].length];
        int lengthOne = sectionOne.length;
        int lengthTwo = sectionTwo.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lengthOne && j < lengthTwo) {
            ultimateArray[k++] = sectionOne[i++];
            ultimateArray[k++] = sectionTwo[j++];
        }

        while (i < lengthOne) {
            ultimateArray[k++] = sectionOne[i++];
        }

        while (j < lengthTwo) {
            ultimateArray[k++] = sectionTwo[j++];
        }
        return ultimateArray;
    }
}
