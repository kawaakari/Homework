package Lesson2;
import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discriminant, x1, x2;

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите c: ");
        int c = scanner.nextInt();

        discriminant = discriminant(a, b, c);


        if (discriminant < 0){
            System.out.println("D < 0. Действительных корней нет."); //ИСПРАВИТЬ ТЕКСТ
        } else if (discriminant == 0) {
            x1 = (-1) * b / (2 * a);
            System.out.println("Уравнение имеет один корень. x = " + x1);
        } else {
            x1 = ((-1) * b + Math.sqrt(discriminant)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }

        }

    private static double discriminant(int a, int b, int c) {
        double discriminant;
        discriminant = Math.pow(b,2) - (4 * a * c);
        return discriminant;
    }
}

