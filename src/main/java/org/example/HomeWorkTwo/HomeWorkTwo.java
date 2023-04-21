package org.example.HomeWorkTwo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWorkTwo {
    public static String parseString(String text) {
        String[] temp = text.replaceAll("}", "").split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i += 3) {
            String lastName = temp[i].split(":")[1];
            String grade = temp[i + 1].split(":")[1];
            String lessonTitle = temp[i + 2].split(":")[1].trim();
            stringBuilder.append("Студент ");
            stringBuilder.append(lastName);
            stringBuilder.append(" получил ");
            stringBuilder.append(grade);
            stringBuilder.append(" по предмету ");
            stringBuilder.append(lessonTitle);
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
    public static String parseJson(String path)  {
        String result = null;
        FileReader fileReader = null;
        StringBuilder stringBuilder = null;
        try {
            fileReader = new FileReader(path);
            stringBuilder = new StringBuilder();
            int ch;
            while ((ch = fileReader.read()) != -1) {

                stringBuilder.append((char)ch);
            }
            result = stringBuilder.toString();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void writeToFile(String str, String path){
        int length = str.length();
        try (FileWriter writer = new FileWriter(path)) {
            for (int i = 0; i < length; i++) {
                writer.write(str.charAt(i));
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static int[] sortBubbleWithLog(int[] arr) {
        Logger logger = Logger.getLogger("SortBubble");
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter form = new SimpleFormatter();
        fh.setFormatter(form);
        int temp;
        String log;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                    log = "Change value " + arr[j] + " on " + temp;
                    logger.log(Level.INFO, log);
                }
            }
        }
        fh.close();
        return arr;
    }
}
