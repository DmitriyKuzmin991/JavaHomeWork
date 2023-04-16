package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getTriangleNumber(5));
        //System.out.println(getFactorial(5));
        //getPrimeNumbers();
        //Calculator.calculator();
        restoreMathEquality("2? + 1?1 = 140");
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
            if (isPrime(i)) {
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
    static void restoreMathEquality (String example) {
        String[] mathEquality = example.split("=");
        int resultEquality = Integer.parseInt(mathEquality[1].trim());
        String[] componentsEquality = mathEquality[0].split(" ");
        String firs = componentsEquality[0];
        String second = componentsEquality[2];
        for (int i = 0; i < 10; i++) {
            int oneValue = getValueInsteadOfQuestion(firs,i);
            if (second.contains("?")) {
                for (int j = 0; j < 10; j++) {
                    int secondValue = getValueInsteadOfQuestion(second,j);
                    if (oneValue + secondValue == resultEquality) {
                        System.out.println(oneValue + " + " + secondValue + " = " + resultEquality);
                        return;
                    }
                }
            } else {
                int secondValue = Integer.parseInt(second);
                if (oneValue + secondValue == resultEquality) {
                    System.out.println(oneValue + " + " + secondValue + " = " + resultEquality);
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

