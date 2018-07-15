package Lesson2;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (isDateValid(day, month, year)) {
            day++;
             if (isDateValid(day, month, year)) {
                // проверяем, реальна ли новая дата, если реальна - порядок, вывод;
                 output(day, month, year);

             } else { //если нет - проблема в количестве дней; переходим на первое число следующего месяца
                 day = 1;
                 month++;
                 if (isDateValid(day,month,year)) {
                     output(day,month,year);
                 } else {                       //если месяц вышел за лимит 12, меняем год
                     month = 1;
                     year++;
                     output(day,month,year);
                 }
             }

        } else {
            System.out.println("Введена некорректная дата");
        }
    }

    private static void output(int day, int month, int year) {
        System.out.println(day + "." + month + "." + year);
    }


    private static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || day > 31) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    return false;
                }
                break;
            case 2:
                if (isYearLeap(year)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }
        return true;
    }

    private static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}


