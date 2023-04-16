package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getTriangleNumber(5));
        //System.out.println(getFactorial(5));
        //getPrimeNumbers();
        //Calculator.calculator();
        //restoreMath("2? + 1?1 = 140");
    }
    static int getTriangleNumber(int number) {
        double result = number * 0.5 * (number + 1);
        return (int) result;
    }
    static int getFactorial(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result = result * i ;
        }
        return result;
    }
    static void getPrimeNumbers() {
        for (int i = 2; i <= 1000; i++) {
            if ( isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int number) {
        if(number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i  <= number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void restoreMath (String example) {
        var result = example.split("=");
        var end = Integer.parseInt(result[1].trim());
        var mathDoing = result[0].replace("+","!").split("!");
        String firs = mathDoing[0].trim();
        String second = mathDoing[1].trim();
        for (int i = 0; i < 10; i++) {
            int one = getValueInsteadOfQuestion(firs,i);
            if (second.contains("?")) {
                for (int j = 0; j < 10; j++) {
                    int two = getValueInsteadOfQuestion(second,j);
                    if (one + two == end) {
                        System.out.println(one + " + " + two + " = " + end);
                        return;
                    }
                }
            } else {
                int secondItem = Integer.parseInt(second);
                if (one + secondItem == end) {
                    System.out.println(one + " + " + secondItem + " = " + end);
                    return;
                }
            }

        }

        System.out.println("Решений нет");

    }
    static int getValueInsteadOfQuestion(String value, int index) {
        String count = Integer.toString(index);
        String temp = value.replace("?", count);
        return Integer.parseInt(temp);
    }
}

