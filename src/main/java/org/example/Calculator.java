package org.example;

import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scan.nextInt();
        System.out.print("Введите второе число: ");
        int second = scan.nextInt();
        System.out.print("Введите знак(+,-,/,*): ");
        String str = scan.next();
        char sigill = str.charAt(0);
        double result = 0;
        switch (sigill) {
            case ('+') -> result = first + second;
            case ('-') -> result = first - second;
            case ('*') -> result = first * second;
            case ('/') -> result = (double)first / second;
            default -> {
                System.out.println("Ошибка");
                return;
            }
        }
        System.out.printf("Результат выражения %d %s %d = %.1f",first,sigill,second,result);
    }
}

