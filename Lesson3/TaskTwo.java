package Lesson3;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int a, b, i, f;

        f = 0;
        a = 0;
        b = 1;
        for (; f < inputValue; ) {
            System.out.print(f + " ");
            f = a + b;
            a = b;
            b = f;
        }
    }
}

