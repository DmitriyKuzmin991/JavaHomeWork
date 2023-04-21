package org.example.Seminar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SeminarTwo {
    public static void main(String[] args) {
//       char c1 = 'a';
//       char c2 = 'b';
//        int n = 10;
//        System.out.println(ex0(c1, c2, n));
//        System.out.println(ex2_1("Рђ СЂРѕР·Р° СѓРїР°Р»Р° РЅР° Р»Р°РїСѓ РђР·РѕСЂР°"));
        ex3("Test", 20);
    }

    static void ex3(String s, int n) {
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "g/g/g/g/gtest.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("РўРµСЃС‚");
        fileHandler.close();
    }

    static String repeatString(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
//            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    static boolean ex2_1(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    static boolean ex2(String s) {
        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);
    }

    static String ex1(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                stringBuilder.append(arr[i - 1]);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length - 1]);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }


}
