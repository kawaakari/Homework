package Lesson3;

import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Введите количество дней: ");
        Scanner scanner = new Scanner(System.in);
        int daysNumber = scanner.nextInt();
        int sum = 0;
        double mean = 0;   //среднее за N дней
        int currentMax = 0;
        int maxFinal = 0;
        int maxDay = 0;

        for (int i = 1; i <= daysNumber; i++) {
            System.out.print("Количество осадков в " + i + "-й день: ");
            int rainfall = scanner.nextInt();
            sum += rainfall;
            mean = sum / i;
            currentMax = rainfall;
            if (currentMax > maxFinal) {
                maxFinal = currentMax;
                maxDay = i;
            }
        }

        System.out.printf("За %d дней выпало в общей сложности %d мм осадков. В среднем %d мм в сутки. " +
                "На %d-й день зафиксировано максимальное количество осадков - %d мм.", daysNumber, sum, (int) mean, maxDay, maxFinal);
    }
}
