package Lesson2;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину дома 1: ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину дома 1: ");
        int b = scanner.nextInt();
        System.out.print("Введите длину дома 2: ");
        int c = scanner.nextInt();
        System.out.print("Введите ширину дома 2: ");
        int d = scanner.nextInt();
        System.out.print("Введите длину участка: ");
        int e = scanner.nextInt();
        System.out.print("Введите ширину участка: ");
        int f = scanner.nextInt();


        if (isFirstHouseFit(a,b,e,f)) {
            System.out.println("Дом 1 помещается на указанном участке.");
        } else {
            System.out.println("Дом 1 не поместится на указанном участке.");
        }

        if (isSecondHouseFit(c,d,e,f)) {
            System.out.println("Дом 2 помещается на указанном участке.");
        } else {
            System.out.println("Дом 2 не поместится на указанном участке.");
        }
        }

            private static boolean isFirstHouseFit(int a, int b,int e,int f) {
        if (e*f >= a*b) {
            return true;
        } else {
            return false; }
    }
            private static boolean isSecondHouseFit(int c, int d, int e, int f) {
        if (e*f >= c*d) {
            return true;
        } else {
            return false; }
    }

    }

