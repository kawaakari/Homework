package Lesson3;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int inputValue = scanner.nextInt();
        int result = 0;
        while (inputValue != 0) {
            int remainder = inputValue % 10;
            result += remainder;
            inputValue /= 10;
        }
        System.out.println(result);
    }
}
