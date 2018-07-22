package homeworkfive;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String str = scanner.next();
        output(str);
    }

    private static void output(String str) {
        if (isPalindrome(str)) {
            System.out.println("Слово является палиндромом.");
        } else {
            System.out.println("Слово не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String str) {
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1)) {
                return result;
            } else {
                result = false;
            }
        }
        return result;
    }
}
